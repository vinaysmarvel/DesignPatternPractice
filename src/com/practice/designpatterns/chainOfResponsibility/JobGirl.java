package com.practice.designpatterns.chainOfResponsibility;

public class JobGirl implements GirlChain {

private GirlChain girlChain;
	
	@Override
	public void setNextGirlInChain(GirlChain girlInChain) {
		this.girlChain = girlInChain;
	}

	@Override
	public void getProposal(BoyProposal boysProposal) {
		if(boysProposal.getUniqueCharacteristic().equals("Job")){
			System.out.println("I care for Job, So you are accepted");
		}
		else{
			girlChain.getProposal(boysProposal);
		}
	}
}
