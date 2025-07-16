package com.adminportal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adminportal.domain.Category;
import com.adminportal.domain.Contact;
import com.adminportal.service.CategoryService;
import com.adminportal.service.ContactService;
import com.adminportal.service.TrendingTopicService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private TrendingTopicService trendingTopicService;
	
	@Autowired
	private ContactService contactService;
	
	
	
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addCategory(Model model) {
		Category category = new Category();
		model.addAttribute("category",category);
		return "addCategory";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addCategoryPost(@ModelAttribute("category") Category category, HttpServletRequest request) {
		categoryService.save(category);
		
		return "redirect:categoryList";
		
		
	}
	
	@RequestMapping("/categoryList")
	public String categoryList(Model model) {
		List<Category> categoryList = categoryService.findAll();
		model.addAttribute("categoryList",categoryList);
	
		return "categoryList";
	}
	
	@RequestMapping("/contactList")
	public String contactList(Model model) {
		List<Contact> contactList = contactService.findAll();
		model.addAttribute("contactList",contactList);
	
		return "contactList";
	}
	
	
	
	
	


}
