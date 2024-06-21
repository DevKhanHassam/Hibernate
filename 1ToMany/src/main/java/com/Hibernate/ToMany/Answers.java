package com.Hibernate.ToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {

	@Id
	private int Answer_id;
	private String Answer;
	
	@ManyToOne
	private Questions questions;
	
	
	
	public int getAnswer_id() {
		return Answer_id;
	}
	public void setAnswer_id(int answer_id) {
		Answer_id = answer_id;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public Questions getQuestions() {
		return questions;
	}
	public void setQuestions(Questions questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "Answers [Answer_id=" + Answer_id + ", Answer=" + Answer + ", questions=" + questions + "]";
	}
	
	
}
