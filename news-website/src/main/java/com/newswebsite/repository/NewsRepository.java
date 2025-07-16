package com.newswebsite.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.newswebsite.domain.News;


public interface NewsRepository extends JpaRepository<News, Long> {
	

	
	@Query(value="select n from News n where n.id = ?1")
	public News findOne(Long id);
	

}
