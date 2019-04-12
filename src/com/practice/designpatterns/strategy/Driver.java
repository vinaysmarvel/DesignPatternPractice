package com.practice.designpatterns.strategy;

public class Driver {
	
	
	public static void main(String[] args) {
		ProblemSolver problemSolver = new ProblemSolver(new GreedyTechnique());
		problemSolver.solveTravellingSalesmanProblem();
		
		ProblemSolver problemSolver2 = new ProblemSolver(new SubtractAndConquerTechnique());
		problemSolver2.solveTravellingSalesmanProblem();
	}
}
