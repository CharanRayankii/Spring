package com.rc.SpringBoot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value= {"","/","home"})
	public String displayHomePage(Model model) {
		model.addAttribute("userName","Radhe Radhe");
		return "home.html";
	}
	

}
