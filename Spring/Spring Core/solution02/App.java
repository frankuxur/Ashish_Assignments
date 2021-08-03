package com.solution02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Com/solution02/config.xml");
		Question question = (Question) context.getBean("question");
//		System.out.println(question.getName());
		System.out.println(question.getquestionId());
		System.out.println(question.getquestion());
		System.out.println(question.getanswers());
    }
}
