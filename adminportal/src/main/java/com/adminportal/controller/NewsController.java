package com.adminportal.controller;





import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.adminportal.domain.Category;
import com.adminportal.domain.News;
import com.adminportal.service.CategoryService;
import com.adminportal.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {

	
	
	@Autowired
	private NewsService newsService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addNews(Model model) {
		News news = new News();
		
		List<Category> categoryList = categoryService.findAllActiveByCategory();
		
		
		
		model.addAttribute("news",news);
		model.addAttribute("categoryList",categoryList);
		
		
		return "addNews";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addNewsPost(@RequestParam("newsImage") MultipartFile file,
			@RequestParam("title") String title,
			@RequestParam("author") String author,
			@RequestParam("category") String category,
			@RequestParam("newsType") String newsType,
			@RequestParam("active") boolean active,
			@RequestParam("description") String description,
			@RequestParam("subTitle") String subTitle
			
			) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("d MMM yyy HH:mm");
		String formatted = format1.format(cal.getTime());
		
		
				
		newsService.saveNewsToDB(file, title, author, formatted, category,newsType, active, description,subTitle);

		

		
		return "redirect:newsList";
	}
	
	@RequestMapping("/newsList")
	public String newsList(Model model) {
		List<News> newsList = newsService.findAll();
		model.addAttribute("newsList",newsList);
		
		
		return "newsList";
	}

}
