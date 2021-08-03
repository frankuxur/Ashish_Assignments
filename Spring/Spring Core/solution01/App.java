package com.solution01;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("Com/solution01/config.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
    }
}
