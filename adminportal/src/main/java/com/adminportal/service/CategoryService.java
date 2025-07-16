package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Category;

public interface CategoryService {
	
	Category save(Category category);
	
	List<Category> findAll();
	
	List<Category> findAllActiveByCategory();
	
	
	

}
