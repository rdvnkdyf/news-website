package com.newswebsite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.newswebsite.domain.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	@Query(value="select * from category where active = 1 order by id asc limit 0,6",nativeQuery = true)
	public List<Category> findFirst6ByCategory();
	
	@Query(value="select * from category where active = 1 order by id asc limit 6,100",nativeQuery = true)
	public List<Category> findAfter6ByCategory();
	
	
	

}
