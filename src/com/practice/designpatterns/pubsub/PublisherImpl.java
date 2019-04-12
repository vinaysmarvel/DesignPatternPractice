package com.practice.designpatterns.pubsub;
import java.util.HashSet;
import java.util.Set;


public class PublisherImpl implements Publisher{

	private Set<Observer> observerSet = new HashSet<Observer>();
	private String message ;
	
	public void stateChange(String message){
		System.out.println(message + " was received");
		this.message = message;
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer : observerSet){
			observer.update(message);
		}
	}

	@Override
	public void register(Observer observer) {
		if(observer != null){
			if(!observerSet.contains(observer)){
				observerSet.add(observer);
			}
		}
	}

	@Override
	public void deRegister(Observer observer) {
		if(observer != null){
			if(observerSet.contains(observer)){
				observerSet.remove(observer);
			}
		}
	}
	
	

}
