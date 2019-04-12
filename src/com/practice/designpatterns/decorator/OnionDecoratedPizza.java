package com.practice.designpatterns.decorator;

import java.util.List;

public class OnionDecoratedPizza implements Pizza{
	private Pizza pizza ;
	double cost = 10d;
	
	public OnionDecoratedPizza(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public double getCost() {
		return pizza.getCost() + cost;
	}

	@Override
	public List<String> getIngredients() {
		List<String> ingrList = pizza.getIngredients();
		ingrList.add("Onion");
		return ingrList;
		
	}

}
