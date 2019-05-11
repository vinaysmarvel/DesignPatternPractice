package com.practice.designpatterns.proxy;

public class EmployeeProxy implements Person {

	private Employee employee;
	
	public EmployeeProxy(Employee employee){
		this.employee = employee;
	}
	
	@Override
	public int getAge() {
		return employee.getAge();
	}

	@Override
	public int getSalary() {
		return employee.getSalary();
	}

}
