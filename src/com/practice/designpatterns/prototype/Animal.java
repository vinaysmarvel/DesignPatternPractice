package com.practice.designpatterns.prototype;

public abstract class Animal implements Prototype{

	@Override
	public Animal makeCopy() {
		System.out.println("Animal is being created");
		Animal animal = null;
		try {
			animal = (Animal) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return animal;
	}
	
}
