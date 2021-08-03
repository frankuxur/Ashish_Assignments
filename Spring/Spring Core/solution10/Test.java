package com.solution10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/solution10/config.xml");
		LifeCycle s1 = (LifeCycle) context.getBean("life");
		System.out.println(s1);
	}
}
