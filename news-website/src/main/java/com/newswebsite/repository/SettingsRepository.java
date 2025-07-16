package com.newswebsite.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.newswebsite.domain.Settings;


public interface SettingsRepository extends JpaRepository<Settings, Long> {
	
	@Query(value="select * from settings",nativeQuery = true)
	public Settings findBySettings();
	
	
	
	
	
	
	
	
	
	
	

}
