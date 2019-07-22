package com.scrut.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scrut.model.Score;

@Repository
public class ScoreDAOImpl implements ScoreDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveScore(Score theScore) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theScore);

	}

}
