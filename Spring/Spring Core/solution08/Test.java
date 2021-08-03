package com.solution08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/solution08/config.xml");
		
		context.registerShutdownHook();
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		
		System.out.println("_________________________________________\n");
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		System.out.println("_________________________________________\n");
		
		Water w1 = (Water) context.getBean("w1");
		System.out.println(w1);
	}
}
