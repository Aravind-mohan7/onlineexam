package com.scrut.DAO;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.hibernate.Criteria;
import com.scrut.model.Questions;

@Repository
public class QuestionsDAOImpl implements QuestionsDAO {

	JdbcTemplate template;
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Questions> getQuestions() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Questions> cq=cb.createQuery(Questions.class);
		Root<Questions> root=cq.from(Questions.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
	}
	
	public List<Questions> getQuestionsjava() {
		Session session=sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Questions.class);
		crit.add(Restrictions.eq("assessment_id",1));
		List<Questions> results = crit.list();
		return results;	
		
	}
	
	public List<Questions> getQuestionscpp() {
		Session session=sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Questions.class);
		crit.add(Restrictions.eq("assessment_id",2));
		List<Questions> results = crit.list();
		return results;	
		
	}
	
	public List<Questions> getQuestionsphp() {
		Session session=sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Questions.class);
		crit.add(Restrictions.eq("assessment_id",3));
		List<Questions> results = crit.list();
		return results;	
		
	}
	


}
