package com.solution10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycle implements ApplicationContextAware{
	LifeCycle temp;
//	private ApplicationContext ap;
	private String message;

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
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

	public void setApplicationContext(ApplicationContext ap) throws BeansException {
		temp = (LifeCycle) ap.getBean("life");
		System.out.println(temp);
	}
}
