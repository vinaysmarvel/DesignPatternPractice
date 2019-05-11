package com.practice.designpatterns.proxy;

import java.util.Date;

public class Employee implements Person{

	private int id;
	private String name;
	private Date dob;
	public int getAge() {	
		return 26;
	}
	public int getSalary() {
		return 28000;
	}
	
	public String getName() {
		return name == null ? "dummy" : name;
	}
	
	
}
