package com.practice.designpatterns.chainOfResponsibility;

public interface GirlChain {

	public void setNextGirlInChain(GirlChain girlInChain);
	public void getProposal(BoyProposal boysProposal);
	
}
