package com.newswebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newswebsite.domain.TrendingTopic;
import com.newswebsite.repository.TrendingTopicRepository;
import com.newswebsite.service.TrendingTopicService;

@Service
public class TrendingTopicImpl implements TrendingTopicService {

	@Autowired
	private TrendingTopicRepository trendingTopicRepository;
	
	

	@Override
	public List<TrendingTopic> findAll() {
		
		return (List<TrendingTopic>) trendingTopicRepository.findAll();
	}

}
