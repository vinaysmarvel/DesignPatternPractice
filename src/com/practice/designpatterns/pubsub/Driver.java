package com.practice.designpatterns.pubsub;

public class Driver {

	
	public static void main(String[] args){
		Observer obs1 = new ObserverImpl1();
		Observer obs2 = new ObserverImpl2();
		PublisherImpl pub = new PublisherImpl();
		pub.register(obs1);
		pub.register(obs2);
		pub.stateChange("hello");
	}
}
