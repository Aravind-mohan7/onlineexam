package com.scrut.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scrut.model.Candidate;

@Repository
public class CandidateDAOImpl implements CandidateDAO {

	@Autowired
	private SessionFactory sessionFactory;	
	
	public void saveCandidate(Candidate theCandidate) {
			Session currentSession=sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(theCandidate);

		}

}
