package com.myorg.test.sample_ldap_login;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer
{
 protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
 {
  return application.sources(new Class[] { LdpaauthApplication.class });
  }
}
