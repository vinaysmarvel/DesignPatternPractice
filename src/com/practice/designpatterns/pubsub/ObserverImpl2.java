package com.practice.designpatterns.pubsub;

public class ObserverImpl2 implements Observer {

	@Override
	public void update(Object message) {
		System.out.println((String)message +"  received in ObserverImpl2");
	}

}
