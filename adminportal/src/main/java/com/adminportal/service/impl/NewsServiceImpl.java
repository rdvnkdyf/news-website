package com.adminportal.service.impl;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


import com.adminportal.domain.News;

import com.adminportal.repository.NewsRepository;
import com.adminportal.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsRepository newsRepository;
	
	
	

	

	@Override
	public List<News> findAll() {
		
		return (List<News>) newsRepository.findAll();
		
	}



	@Override
	public void saveNewsToDB(MultipartFile file, String title, String author, String publicationDate, String category,String newsType,
			boolean active, String description,String subTitle) {
		News n = new News();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			n.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		n.setTitle(title);
		n.setAuthor(author);
		n.setPublicationDate(publicationDate);
		n.setCategory(category);
		n.setNewsType(newsType);
		n.setActive(active);
		n.setDescription(description);
		n.setSubTitle(subTitle);
		newsRepository.save(n);
		
		
	}



	



	
	

}
