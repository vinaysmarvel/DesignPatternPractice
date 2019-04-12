package com.practice.designpatterns.decorator;

public class Driver {

	
	public static void main(String[] args) {
		Pizza pizza = new TomatoDecoratedPizza( new TomatoDecoratedPizza(new OnionDecoratedPizza(new PlainPizza())));
		System.out.println("Cost is "+pizza.getCost());
		System.out.println("Ingredients are "+pizza.getIngredients());
	}
}
