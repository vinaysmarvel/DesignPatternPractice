package com.practice.designpatterns.adapter;

public interface Port {

	void transmit(String message);
	void connect(ConnectorConverter converter);

}
