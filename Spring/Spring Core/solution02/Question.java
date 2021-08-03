package com.solution02;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
//	private String name;
	private List<String> questionId;
	private Set<String> question;
	private Map<Integer, String> answers;
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public List<String> getquestionId() {
		return questionId;
	}
	public void setquestionId(List<String> questionId) {
		this.questionId = questionId;
	}
	public Set<String> getquestion() {
		return question;
	}
	public void setquestion(Set<String> question) {
		this.question = question;
	}
	public Map<Integer, String> getanswers() {
		return answers;
	}
	public void setanswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	
	public Question(String name, List<String> questionId, Set<String> question, Map<Integer, String> answers) {
		super();
//		this.name = name;
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
