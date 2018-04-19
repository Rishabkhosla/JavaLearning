package com.learn.java;

public class Tyota implements Runable {
	
	@Override
	public void design() {
		System.out.println("the design of car is based on suv series");
		
	}

	@Override
	public void construct() {
		System.out.println("the car construct in 30 days");
		
	}

	@Override
	public void cost() {
		System.out.println("the cost of car is 8 lacs");
		
	}
	public static void main(String args[]){
		Maruti mm=new Maruti();
		Tyota ty=new Tyota();
		mm.design();
		mm.construct();
		mm.cost();
		ty.design();
		ty.construct();
		ty.cost();
		
	}
	
	

}
