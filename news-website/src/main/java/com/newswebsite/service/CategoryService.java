package com.newswebsite.service;

import java.util.List;

import com.newswebsite.domain.Category;


public interface CategoryService {
	
	List<Category> findFirst6ByCategory();
	
	List<Category> findAfter6ByCategory();
	
	
	
	

	
	
	

}
