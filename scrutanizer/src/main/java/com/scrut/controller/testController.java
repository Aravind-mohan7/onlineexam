package com.scrut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scrut.model.Candidate;
import com.scrut.model.Questions;
import com.scrut.model.Score;
import com.scrut.model.User;
import com.scrut.service.CandidateService;
import com.scrut.service.QuestionsService;
import com.scrut.service.ScoreService;
import com.scrut.service.UserService;

@Controller
@RequestMapping("/test")
public class testController {

	@Autowired
	private QuestionsService questionsService;
	
	
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping(value="/preTest",method = {RequestMethod.POST, RequestMethod.GET})
	public String preTest(){
		return "pre-test";
	}
	
	@GetMapping("/startTestjava")
	public String listjavaQuestions(ModelMap theModel) {
		List<Questions> theQuestions=questionsService.getQuestionsjava();
		theModel.addAttribute("questionlist",theQuestions);
		return "start-exam";
	}
	
	@GetMapping("/startTestcpp")
	public String listcppQuestions(ModelMap theModel) {
		List<Questions> theQuestions=questionsService.getQuestionscpp();
		theModel.addAttribute("questionlist",theQuestions);
		return "start-exam";
	}
	
	@GetMapping("/startTestphp")
	public String listphpQuestions(ModelMap theModel) {
		List<Questions> theQuestions=questionsService.getQuestionsphp();
		theModel.addAttribute("questionlist",theQuestions);
		return "start-exam";
	}
	
//	@GetMapping("/startTest")
//	public String listQuestions(ModelMap theModel) {
//		List<Questions> theQuestions=questionsService.getQuestions();
//		theModel.addAttribute("questionlist",theQuestions);
//		return "start-exam";
//	}
	
	@GetMapping("/testEnd")
	public String saveScore(@ModelAttribute("scoreattr") Score theScore) {
		scoreService.saveScore(theScore);
		return "reportcard";
		
}
}
