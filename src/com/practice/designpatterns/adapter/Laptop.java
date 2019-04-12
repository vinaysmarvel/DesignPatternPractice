package com.practice.designpatterns.adapter;

public class Laptop {

	private final Port usbPort = new USBPort();
	
	public void project(){
		String data = "hello";
		System.out.println("Sending "+ data + " from Laptop");
		usbPort.transmit("hello");
	}

	public Port getUsbPort() {
		return usbPort;
	}	
	
	
}
