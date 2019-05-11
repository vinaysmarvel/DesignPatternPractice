package com.practice.designpatterns.chainOfResponsibility;

public class MoneyGirl implements GirlChain {

	private GirlChain girlChain;
	
	@Override
	public void setNextGirlInChain(GirlChain girlInChain) {
		this.girlChain = girlInChain;
	}

	@Override
	public void getProposal(BoyProposal boysProposal) {
		if(boysProposal.getUniqueCharacteristic().equals("Money")){
			System.out.println("I care for money, So you are accepted");
		}
		else{
			girlChain.getProposal(boysProposal);
		}
	}

}
