package com.practice.designpatterns.singleton;

import java.io.Serializable;

public class President implements Serializable, Cloneable{
	
	private static final long serialVersionUID = -960707925126352789L;
	private static President instance = null;
	
	private President(){
		
	}
	
	public static President getInstance(){
		if(instance == null){
			synchronized(President.class){
				if(instance == null){
					instance = new President();
				}
			}
		}
		return instance;
	}
	 
	public Object readResolve(){
		return getInstance();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	
}
