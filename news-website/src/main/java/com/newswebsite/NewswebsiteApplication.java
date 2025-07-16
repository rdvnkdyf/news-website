package com.newswebsite;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.newswebsite.domain.User;
import com.newswebsite.domain.security.Role;
import com.newswebsite.domain.security.UserRole;
import com.newswebsite.service.UserService;
import com.newswebsite.utility.SecurityUtility;

@SpringBootApplication
public class NewswebsiteApplication implements CommandLineRunner  {

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(NewswebsiteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User();
		user1.setFirstname("John");
		user1.setLastname("Adams");
		user1.setUsername("j");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("jAdams@gmail.com");
		user1.setRoleId(2);
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(2);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1,role1));
		
		userService.createUser(user1,userRoles);
		
		
		
		
		
	}

}
