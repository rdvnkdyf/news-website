package com.adminportal.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.adminportal.domain.News;

public interface NewsRepository extends JpaRepository<News,Long>{
	
	

}
