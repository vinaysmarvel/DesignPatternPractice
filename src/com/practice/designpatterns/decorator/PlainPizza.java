package com.practice.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class PlainPizza implements Pizza{
	double cost = 100d;
	public PlainPizza(){
		
	}
	

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public List<String> getIngredients() {
		// TODO Auto-generated method stub
		List<String> pizza =   new ArrayList<String>();
		pizza.add("Plain Pizza");
		return pizza;
	}

}
