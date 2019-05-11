package com.practice.designpatterns.proxy;

public class Driver {

	public static void main(String[] args) {
		Person employee = new Employee();
		Person employeeProxy = new EmployeeProxy((Employee)employee);
		
		System.out.println("Salary of employee: "+ employee.getSalary());
		System.out.println("Salary of employeeProxy: "+ employeeProxy.getSalary());
		
		System.out.println("Age of employee: "+ employee.getAge());
		System.out.println("Age of employeeProxy: "+ employeeProxy.getAge());
		
		//can be cast to employee object and use its unintended information, Hence we cant expose this via a simple interface
		System.out.println("name of employee: "+ ((Employee)employee).getName());
		
		//can be cast to employee object.. java.lang.ClassCastException will be thrown.. SO WE NEED PROXY
//		System.out.println("Age pf employeeProxy: "+ ((Employee)employeeProxy).getName());
		// results in compilation error as getName is undefined in employeeProxy
//		System.out.println("Age pf employeeProxy: "+ ((EmployeeProxy)employeeProxy).getName());
		
	}
	
}
