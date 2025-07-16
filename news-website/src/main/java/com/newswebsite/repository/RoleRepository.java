package com.newswebsite.repository;

import org.springframework.data.repository.CrudRepository;
import com.newswebsite.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
