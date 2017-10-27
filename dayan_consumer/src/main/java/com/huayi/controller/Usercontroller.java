package com.huayi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huayi.service.UserService;

@Controller
@RequestMapping("/user/")
public class Usercontroller {
  
	@Autowired
	private UserService userService;
	
	@RequestMapping("find")
	public String getUser(Model mod){
		
		mod.addAttribute("user", userService.getUser());
		
		return "list";
	}
}
