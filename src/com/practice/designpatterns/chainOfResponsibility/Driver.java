package com.practice.designpatterns.chainOfResponsibility;

public class Driver {

	public static void main(String[] args) {
		GirlChain sona = new MoneyGirl();
		GirlChain mona = new LooksGirl();
		GirlChain lona = new JobGirl();
		GirlChain gona = new FameGirl();
		
		lona.setNextGirlInChain(gona);
		mona.setNextGirlInChain(lona);
		sona.setNextGirlInChain(mona);
		
		BoyProposal rahulProposal = new BoyProposal("Money");
		BoyProposal ramProposal = new BoyProposal("Looks");
		BoyProposal tomProposal = new BoyProposal("Job");
		BoyProposal harryProposal = new BoyProposal("Fame");
		BoyProposal rajProposal = new BoyProposal("NRI");
		
		sona.getProposal(rahulProposal);
		sona.getProposal(ramProposal);
		sona.getProposal(tomProposal);
		sona.getProposal(harryProposal);
		sona.getProposal(rajProposal);
		
	}
	
}
