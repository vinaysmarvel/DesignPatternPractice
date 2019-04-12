package com.practice.designpatterns.adapter;

public class Driver {

	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.getUsbPort().connect(new USBToOtherConverter(new TypeCPort()));
		laptop.project();
	}
}
