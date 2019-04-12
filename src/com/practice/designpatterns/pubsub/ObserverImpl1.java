package com.practice.designpatterns.pubsub;

public class ObserverImpl1 implements Observer {

	@Override
	public void update(Object message) {
		System.out.println((String)message+ " received in ObserverImpl1");
	}

}
