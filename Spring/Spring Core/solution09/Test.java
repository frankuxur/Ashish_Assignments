package com.solution09;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/solution09/config.xml");
		
		context.registerShutdownHook();
		LifeCycle s1 = (LifeCycle) context.getBean("life");
		System.out.println(s1);
	}
}
