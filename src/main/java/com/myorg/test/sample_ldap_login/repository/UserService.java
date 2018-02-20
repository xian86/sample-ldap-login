package com.myorg.test.sample_ldap_login.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Service;
import com.myorg.test.sample_ldap_login.domain.User;

@Service
public class UserService
{
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private LdapTemplate ldapTemplate;
	public Iterable<User> findAll()
	{
		Iterable<User> users = this.userRepo.findAll();
		return users;
	}

	public User findUser(String userId)
	{
		User user = this.userRepo.findByUid(userId);
		return user;
	}
}
