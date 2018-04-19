package com.learn.java;
//SubClass
public class MountainBike extends Bike {
	
	public String colour;
	public int price;
	
	public MountainBike(int speed, int gears,int price) {
		super(speed, gears);
		this.price=price;
	}
     public String print(){
    	 return(super.print()+"the price of bike is " +price);
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MountainBike create=new MountainBike(60,5,50000);
		System.out.println( "before any change"+create.print());
		create.brake(5);
		System.out.println(create.speed);
	}

}
