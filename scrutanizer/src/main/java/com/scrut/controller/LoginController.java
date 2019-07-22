package com.scrut.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.scrut.model.Score;
import com.scrut.model.User;
import com.scrut.service.UserService;


@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/candidateLogin")
	public String candidateLogin(Model theModel) {
		User u=new User();
		theModel.addAttribute("user",u);
		return "candidatelogin";	
}
	
	@GetMapping("/report")
	public String showFormForAdd(ModelMap theModel) {
		Score score=new Score();
		theModel.addAttribute("score",score);
		return "view-report";
}
	
	@RequestMapping(value = "/loginUser",  method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView processLogin(@ModelAttribute("user") User theUser) {
		User usr = userService.checkUser(theUser);
		
		
	
		ModelAndView model = null;  
		if (usr == null) {
			model = new ModelAndView("candidatelogin");
			model.addObject("error", "Invalid Username or Password");
			System.out.print("fail");
		} else {
			model = new ModelAndView("candidate-home");
			model.addObject("usr", usr);

		}
		return model;
	}

	
	
}
