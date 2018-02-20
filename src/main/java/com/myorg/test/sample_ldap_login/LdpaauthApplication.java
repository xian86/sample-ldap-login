package com.myorg.test.sample_ldap_login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;
 
@SpringBootApplication
@ComponentScan({"com.myorg.test.sample_ldap_login"})
@EntityScan({"com.myorg.test.sample_ldap_login.domain"})
@EnableLdapRepositories({"com.myorg.test.sample_ldap_login.repository"})
public class LdpaauthApplication
{
public static void main(String[] args)
{
     SpringApplication.run(LdpaauthApplication.class, args);
 }
}
