package com.newswebsite.repository;

import org.springframework.data.repository.CrudRepository;
import com.newswebsite.domain.User;


public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
	User findByEmail(String email);
}
