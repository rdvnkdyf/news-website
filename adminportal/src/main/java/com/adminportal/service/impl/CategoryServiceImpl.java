package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Category;
import com.adminportal.repository.CategoryRepository;
import com.adminportal.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category save(Category category) {
		
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> findAll() {
		
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public List<Category> findAllActiveByCategory() {
		
		return categoryRepository.findAllActiveByCategory();
	}

}
