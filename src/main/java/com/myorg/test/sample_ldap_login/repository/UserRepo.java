package com.myorg.test.sample_ldap_login.repository;

import java.util.List;
import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;
import com.myorg.test.sample_ldap_login.domain.User;

@Repository
public abstract interface UserRepo
  extends LdapRepository<User>
{
  public abstract List<User> findByFullNameContains(String paramString);
  
  public abstract List<User> findByLastName(String paramString);
  
  public abstract User findByUid(String paramString);
}
