package com.practice.designpatterns.Iterator;

public class Driver {

	
	public static void main(String[] args) {
		PersonCollection personCollection = new PersonCollection();
		Iterator it = personCollection.getIterator();
		while(it.hasNext()){
			System.out.println(((Person)it.next()).toString());
		}
	}
}
 