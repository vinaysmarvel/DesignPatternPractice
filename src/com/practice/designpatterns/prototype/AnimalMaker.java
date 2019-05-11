package com.practice.designpatterns.prototype;

public class AnimalMaker{

	public Animal makeCopy(Animal animal) {
		return animal.makeCopy();
	}
	
}
