package com.scrut.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="scoretmp")
public class Score {

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO,generator="score_seq")
	 @SequenceGenerator(name="score_seq",sequenceName="candidate_seq",allocationSize = 1)
	@Column(name = "score_id", updatable = false, nullable = false)
	private int score_id;
	
	@Column(name="candidate_id")
	private int candidate_id;
	
	@Column(name="assessment_id")
	private String assessmen_id;
	
	@Column(name="score")
	private int score;
	
	@Column(name="assessment_date")
	private Date assessment_date;
	
	@Column(name="levelx")
	private int levelx;

	public int getScore_id() {
		return score_id;
	}

	public void setScore_id(int score_id) {
		this.score_id = score_id;
	}

	public int getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}

	public String getAssessmen_id() {
		return assessmen_id;
	}

	public void setAssessmen_id(String assessmen_id) {
		this.assessmen_id = assessmen_id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getAssessment_date() {
		return assessment_date;
	}

	public void setAssessment_date(Date assessment_date) {
		this.assessment_date = assessment_date;
	}

	public int getLevelx() {
		return levelx;
	}

	public void setLevelx(int levelx) {
		this.levelx = levelx;
	}
	
}
