package com.Hibernate.ToMany;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Questions {

	@Id
	private int question_id;
	private String question;
	
	@OneToMany( mappedBy="questions")
	private List<Answers> answers;
	
	
	
	
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	@Override
	public int hashCode() {
		return Objects.hash(answers, question, question_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questions other = (Questions) obj;
		return Objects.equals(answers, other.answers) && Objects.equals(question, other.question)
				&& question_id == other.question_id;
	}
	
	
	
	
	
	
}
