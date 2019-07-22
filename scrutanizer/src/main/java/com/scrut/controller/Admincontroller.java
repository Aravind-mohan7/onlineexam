package com.scrut.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scrut.model.Candidate;
import com.scrut.service.CandidateService;

@Controller
@RequestMapping("/admin")
public class Admincontroller {

//		@Autowired
//		private CandidateService candidateService;
		
		@GetMapping("/adminHome")
		public String showFormForAdd() {
			return "adminhome";
}
	}

