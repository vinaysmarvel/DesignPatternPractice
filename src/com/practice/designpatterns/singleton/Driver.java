package com.practice.designpatterns.singleton;

public class Driver {
	public static void main(String[] args) {
		
		President president = President.getInstance();
		System.out.println(president.hashCode() +" is the hash code of president");
		President president2 = President.getInstance();
		System.out.println(president2.hashCode() +" is the hash code of president2");
		
		try {
			president.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(" clone is not supported for President , exception "+ e.getMessage());
		}
		
	}
}
