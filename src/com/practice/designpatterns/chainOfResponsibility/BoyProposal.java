package com.practice.designpatterns.chainOfResponsibility;

public class BoyProposal {
		
	private String uniqueCharcteristic ;
	
	public BoyProposal(String uniqueCharcteristic) {
		this.uniqueCharcteristic = uniqueCharcteristic;
	}
	
	public String getUniqueCharacteristic(){
		return uniqueCharcteristic;
	}
}
