Spring Login form to authenticate users through an LDAP Server.

An example of web application for user access management realized with Spring Boot, Spring Security and Spring Data LDAP.

The Resource folder contains the application configuration files (in which there is also the configuration for the LDAP Server) and the Log4j. In particular, the .ldif file containing the information for the Test Ldap Server. 
NOTE: the original ldif file was modified, in paritular the coded password has been modified for all users (I could not understand what type of coding was used of Hash type, as written in the reference document, as I tried to use the known ones MD5, SHA 256, SHA 512 without ever having a positive result) -> the password entered in plain text is the same but encoded with LdapShaPasswordEncoder (see WebSecurityConfig class).

In the Java folder there are the source classes of the implemented application; in particular: com.myorg.test -> configuration classes for the application and WebSecurity Spring. com.myorg.test.controller -> the controller class of the MVC web application created com.myorg.test.domain -> the domain class for the User model com.myorg.test.repository -> repository and service classes for domain access

Once the Web application has been launched, it is possible to note that any call to the WebApplication refers to the Login page. Once logged in correctly, the login is redirected to a welcome page, where the user's info (name and surname) is printed on the screen. There is the possibility to log in and try again with a new user.

Test: username: test1 (or test2, test3, test4) Passsword: Password123!