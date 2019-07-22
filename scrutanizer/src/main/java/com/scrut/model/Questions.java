package com.scrut.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Questions {
	
	@Id
	@Column(name = "question_id", nullable = false)
	private int question_id;
	
	@Column(name="assessment_id")
	private int assessment_id;
	
	@Column(name="level_id")
	private int levelid;
	
	@Column(name="content")
	private String content;
	
	@Column(name="option1")
	private String  option1;
	
	@Column(name="option2")
	private String  option2;
	
	@Column(name="option3")
	private String  option3;
	
	@Column(name="option4")
	private String  option4;
	
	@Column(name="answer")
	private String answer;

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public int getAssesssment_id() {
		return assessment_id;
	}

	public void setAssesssment_id(int assesssment_id) {
		this.assessment_id = assesssment_id;
	}

	public int getLevelid() {
		return levelid;
	}

	public void setLevelid(int levelid) {
		this.levelid = levelid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
