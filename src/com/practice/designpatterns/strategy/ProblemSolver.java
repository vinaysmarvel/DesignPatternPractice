package com.practice.designpatterns.strategy;

public class ProblemSolver {

	private AlgorithmParadigm algorithmParadigm;
	
	public ProblemSolver(AlgorithmParadigm algorithmParadigm){
		this.algorithmParadigm = algorithmParadigm;
	}
	
	public void solveTravellingSalesmanProblem(){
		algorithmParadigm.travellingSalesmanProblem();
	}
	
}
