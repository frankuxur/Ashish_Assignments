package com.solution08;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Water {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Water() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Water [price=" + price + "]";
	}
	
	@PostConstruct
	public void postConst() {
		System.out.println("Inside postConstruct method");
	}
	
	@PreDestroy
	public void preDest() {
		System.out.println("Inside preDestroy method");
	}
	
}
