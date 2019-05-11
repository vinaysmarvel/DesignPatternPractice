package com.practice.designpatterns.prototype;

public class Dog extends Animal {

	public Dog(){
		System.out.println("Dog is created");
	}
	

	public Animal makeCopy() {
		System.out.println("Dog is being created");
		return super.makeCopy();
	}

}
