package com.scrut.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrut.DAO.ScoreDAO;
import com.scrut.model.Score;

@Service
public class ScoreServiceImpl implements ScoreService {

	
	@Autowired
	private ScoreDAO scoreDAO;
	
	@Transactional
	public void saveScore(Score theScore) {
		scoreDAO.saveScore(theScore);
	}
}
