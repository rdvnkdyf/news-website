package com.newswebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newswebsite.domain.Settings;
import com.newswebsite.repository.SettingsRepository;
import com.newswebsite.service.SettingsService;

@Service
public class SettingsServiceImpl implements SettingsService {

	@Autowired
	private SettingsRepository settingsRepository;

	@Override
	public Settings findBySettings() {
		
		return settingsRepository.findBySettings();
	}
	
	

	
}
