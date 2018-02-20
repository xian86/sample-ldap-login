package com.myorg.test.sample_ldap_login;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.LdapShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig
  extends WebSecurityConfigurerAdapter
{
  protected void configure(HttpSecurity http)
    throws Exception
  {
    (http.authorizeRequests().anyRequest()).fullyAuthenticated().and().formLogin();
  }
  
  public void configure(AuthenticationManagerBuilder auth)
    throws Exception
  {
    auth.ldapAuthentication().userDnPatterns(new String[] { "uid={0},ou=people" }).groupSearchBase("ou=people").contextSource().url("ldap://localhost:8389/dc=myorg,dc=test").and().passwordCompare().passwordEncoder(new LdapShaPasswordEncoder()).passwordAttribute("userPassword");
  }
}