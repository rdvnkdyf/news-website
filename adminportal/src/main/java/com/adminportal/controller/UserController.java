package com.adminportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adminportal.domain.User;
import com.adminportal.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/userList")
	public String userList(Model model) {
		List<User> userList = userService.findByUserRoleId(2);
		model.addAttribute("userList",userList);
	
		return "userList";
	}
	
	
	
	
	
	


}
