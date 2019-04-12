package com.practice.designpatterns.pubsub;


public interface Publisher {
	void register(Observer observer);
	void deRegister(Observer observer);
	void notifyObservers();
}
