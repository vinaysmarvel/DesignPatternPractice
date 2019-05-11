package com.practice.designpatterns.chainOfResponsibility;

public class FameGirl implements GirlChain {

private GirlChain girlChain;
	
	@Override
	public void setNextGirlInChain(GirlChain girlInChain) {
		this.girlChain = girlInChain;
	}

	@Override
	public void getProposal(BoyProposal boysProposal) {
		if(boysProposal.getUniqueCharacteristic().equals("Fame")){
			System.out.println("I care for Fame, So you are accepted");
		}
		else{
			System.out.println("Our girls gang cant accept your proposal. Sorry for breaking your heart!!");
		}
	}

}
