package com.myorg.test.sample_ldap_login.domain;

import javax.naming.Name;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;
import org.springframework.ldap.odm.annotations.Transient;

@Entry(objectClasses={"inetOrgPerson", "organizationalPerson", "person", "top"}, base="dc=myorg,dc=test")
public final class User
{
  @Id
  private Name id;
  @Attribute(name="cn")
  private String fullName;
  @Attribute(name="sn")
  private String lastName;
  @Attribute(name="uid")
  @DnAttribute(value="uid", index=0)
  private String uid;
  @DnAttribute(value="ou", index=1)
  @Transient
  private String ou;
  @Attribute(name="l")
  private String l;
  @Attribute(name="userPassword")
  private String userPassword;
  
  public Name getId()
  {
    return this.id;
  }
  
  public void setId(Name id)
  {
    this.id = id;
  }
  
  public String getFullName()
  {
    return this.fullName;
  }
  
  public void setFullName(String fullName)
  {
    this.fullName = fullName;
  }
  
  public String getLastName()
  {
    return this.lastName;
  }
  
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  
  public String getUid()
  {
    return this.uid;
  }
  
  public void setUid(String uid)
  {
    this.uid = uid;
  }
  
  public String getOu()
  {
    return this.ou;
  }
  
  public void setOu(String ou)
  {
    this.ou = ou;
  }
  
  public String getL()
  {
    return this.l;
  }
  
  public void setL(String l)
  {
    this.l = l;
  }
  
  public String getUserPassword()
  {
    return this.userPassword;
  }
  
  public void setUserPassword(String userPassword)
  {
    this.userPassword = userPassword;
  }
  
  public boolean equals(Object o)
  {
    if (this == o) {
      return true;
    }
    if ((o == null) || (getClass() != o.getClass())) {
      return false;
    }
    User user = (User)o;
    if (this.id != null ? !this.id.equals(user.id) : user.id != null) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    return this.id != null ? this.id.hashCode() : 0;
  }
}

