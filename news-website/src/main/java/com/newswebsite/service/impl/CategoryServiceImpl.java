package com.newswebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newswebsite.domain.Category;

import com.newswebsite.repository.CategoryRepository;
import com.newswebsite.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> findFirst6ByCategory() {
		
		return categoryRepository.findFirst6ByCategory();
	}

	@Override
	public List<Category> findAfter6ByCategory() {
		return categoryRepository.findAfter6ByCategory();
	}
	
	

	

	

	

}
