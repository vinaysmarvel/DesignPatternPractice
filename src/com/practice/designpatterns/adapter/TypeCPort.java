package com.practice.designpatterns.adapter;

public class TypeCPort implements Port {
	
	ConnectorConverter converter;

	@Override
	public void transmit(String message) {
		System.out.println(message+ " is being sent via Type C port");
		if(converter != null){
			converter.transmit(message);
		}
	}

	@Override
	public void connect(ConnectorConverter converter) {
		this.converter = converter;
	}

}
