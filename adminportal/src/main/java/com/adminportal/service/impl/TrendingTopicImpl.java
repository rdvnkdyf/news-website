package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.adminportal.domain.TrendingTopic;
import com.adminportal.repository.TrendingTopicRepository;
import com.adminportal.service.TrendingTopicService;

@Service
public class TrendingTopicImpl implements TrendingTopicService {

	@Autowired
	private TrendingTopicRepository trendingTopicRepository;
	
	@Override
	public TrendingTopic save(TrendingTopic trendingTopic) {
		
		return trendingTopicRepository.save(trendingTopic);
	}

	@Override
	public List<TrendingTopic> findAll() {
		
		return (List<TrendingTopic>) trendingTopicRepository.findAll();
	}

}
