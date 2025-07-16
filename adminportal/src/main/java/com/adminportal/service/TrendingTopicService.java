package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.TrendingTopic;

public interface TrendingTopicService {
	
	TrendingTopic save(TrendingTopic category);
	
	List<TrendingTopic> findAll();
	
	

}
