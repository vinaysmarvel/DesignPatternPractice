package com.practice.designpatterns.chainOfResponsibility;

public class LooksGirl implements GirlChain {

private GirlChain girlChain;
	
	@Override
	public void setNextGirlInChain(GirlChain girlInChain) {
		this.girlChain = girlInChain;
	}

	@Override
	public void getProposal(BoyProposal boysProposal) {
		if(boysProposal.getUniqueCharacteristic().equals("Looks")){
			System.out.println("I care for Looks, So you are accepted");
		}
		else{
			girlChain.getProposal(boysProposal);
		}
	}

}
