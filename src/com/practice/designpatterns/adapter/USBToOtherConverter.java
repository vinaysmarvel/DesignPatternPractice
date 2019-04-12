package com.practice.designpatterns.adapter;

public class USBToOtherConverter implements ConnectorConverter {
	
	private Port connector;
	
	USBToOtherConverter(Port connector){
		this.connector = connector;
	}
	
	public void transmit(String message){
		connector.transmit(message);
	}

}
