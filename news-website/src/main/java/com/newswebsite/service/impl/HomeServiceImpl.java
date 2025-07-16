package com.newswebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newswebsite.domain.News;
import com.newswebsite.repository.HomeRepository;
import com.newswebsite.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeRepository homeRepository;
	
	@Override
	public List<News> findLast6ByNews() {
		
		return homeRepository.findLast6ByNews();
	}

	@Override
	public List<News> StartAt6Find2News() {
		
		return homeRepository.StartAt6Find2News();
	}

	@Override
	public List<News> StartAt8Find6News() {
		
		return homeRepository.StartAt8Find6News();
	}

	@Override
	public List<News> StartAt14Find10News() {
	
		return homeRepository.StartAt14Find10News();
	}

	@Override
	public List<News> findEditorPicksLast8ByNews() {
		
		return homeRepository.findEditorPicksLast8ByNews();
	}

	public List<News> StartAt24Find10News() {
		// TODO Auto-generated method stub
		return homeRepository.StartAt24Find10News();
	}

	@Override
	public List<News> findPopularLast6ByNews() {
		
		return homeRepository.findPopularLast6ByNews();
	}

	@Override
	public List<News> findScienceByNews() {
		// TODO Auto-generated method stub
		return homeRepository.findScienceByNews();
	}

	@Override
	public List<News> findTechByNews() {
		// TODO Auto-generated method stub
		return homeRepository.findTechByNews();
	}

	@Override
	public List<News> findHealthByNews() {
		// TODO Auto-generated method stub
		return homeRepository.findHealthByNews();
	}

	@Override
	public List<News> findBookArtByNews() {
		// TODO Auto-generated method stub
		return homeRepository.findBookArtByNews();
	}

	
}
