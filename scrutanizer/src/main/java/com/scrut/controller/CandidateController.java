package com.scrut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scrut.model.*;
import com.scrut.service.*;

@Controller
@RequestMapping("/candidate")
public class CandidateController {

	@Autowired
	private CandidateService candidateService;
	
	@GetMapping("/showForm")
	public String showFormForAdd(ModelMap theModel) {
		Candidate theCandidate=new Candidate();
		theModel.addAttribute("candidate",theCandidate);
		return "register";
}
	
	@PostMapping("/saveCandidate")
	public String saveCandidate(@ModelAttribute("candidate") Candidate theCandidate) {
		candidateService.saveCandidate(theCandidate);
		return "redirect:/user/candidateLogin";
		
}
}
