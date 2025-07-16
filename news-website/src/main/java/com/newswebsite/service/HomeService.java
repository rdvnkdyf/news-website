package com.newswebsite.service;

import java.util.List;

import com.newswebsite.domain.News;

public interface HomeService {
	
	List<News> findLast6ByNews();
	
	List<News> StartAt6Find2News();
	
	List<News> StartAt8Find6News();
	
	List<News> StartAt14Find10News();
	
	List<News> findEditorPicksLast8ByNews();
	
	List<News> StartAt24Find10News();
	
	List<News> findPopularLast6ByNews();
	
	List<News> findScienceByNews();
	List<News> findTechByNews();
	List<News> findHealthByNews();
	List<News> findBookArtByNews();
	
	
	
	
	
	
	
	
	
	

}
