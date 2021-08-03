package com.solution09;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycle {
	private String message;

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		System.out.println("Setting message..");
		this.message = message;
	}

	public LifeCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean instance created");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean instance destroyed");
	}
}
