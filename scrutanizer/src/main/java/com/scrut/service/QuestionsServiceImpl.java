package com.scrut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scrut.DAO.QuestionsDAO;
import com.scrut.model.Questions;

@Service
public class QuestionsServiceImpl implements QuestionsService {

	@Autowired
	private QuestionsDAO questionsDAO;
	
	@Transactional
	public List<Questions> getQuestions() {		
		return questionsDAO.getQuestions();
	}
	@Transactional
	public List<Questions> getQuestionsjava() {		
		return questionsDAO.getQuestionsjava();
	}
	@Transactional
	public List<Questions> getQuestionscpp() {		
		return questionsDAO.getQuestionscpp();
	}
	@Transactional
	public List<Questions> getQuestionsphp() {		
		return questionsDAO.getQuestionsphp();
	}

}
