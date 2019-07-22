package com.scrut.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrut.DAO.CandidateDAO;
import com.scrut.model.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateDAO candidateDAO;

	@Transactional
	public void saveCandidate(Candidate theCandidate) {
		candidateDAO.saveCandidate(theCandidate);
	}

}
