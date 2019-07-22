package com.scrut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/navigation")
public class NavigationController {
	
	@GetMapping("/adminLogin")
	public String adminLogin() {
		return "adminlogin";
	
}

	
	@GetMapping("/aboutUs")
	public String aboutUs() {
		return "aboutus";
	}
	

}
