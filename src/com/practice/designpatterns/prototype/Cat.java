package com.practice.designpatterns.prototype;

public class Cat extends Animal{

	public Cat(){
		System.out.println("Cat is created");
	}
	
	@Override
	public Cat makeCopy() {
		System.out.println("Cat is being created");
		return (Cat) super.makeCopy();
	}
	

}
