package com.practice.designpatterns.prototype;

public class Driver {
	
	
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		AnimalMaker animalMaker = new AnimalMaker();
		Animal cat2 = animalMaker.makeCopy(cat);
		Animal dog2 = animalMaker.makeCopy(dog);
		
		System.out.println("Hashcode of cat:"+cat.hashCode());
		System.out.println("Hashcode of cat2:"+cat2.hashCode());
		
		System.out.println("Hashcode of dog:"+dog.hashCode());
		System.out.println("Hashcode of dog2:"+dog2.hashCode());
	}
}
