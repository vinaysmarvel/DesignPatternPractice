package com.practice.designpatterns.decorator;

import java.util.List;

public class TomatoDecoratedPizza implements Pizza{
	private Pizza pizza ;
	double cost = 12d;
	
	public TomatoDecoratedPizza(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public double getCost() {
		return pizza.getCost() + cost;
	}

	@Override
	public List<String> getIngredients() {
		List<String> ingrList = pizza.getIngredients();
		ingrList.add("Tomato");
		return ingrList;
		
	}

}
