package com.learn.java;
//interface example
// parent class
public class Bike {
	public String name;
	public int speed;
    public int gears;
    
    public Bike(int speed,int gears){
    	this.gears=gears;
    	this.speed=speed;
    	
 }
   void accelerate(int increment){
	   speed+=increment;
	   
	   
   }
    void brake(int decrement){
    	
    	speed-=decrement;
    	
    }
    public String print(){
    	return("the bike has name"+name + "speed "+speed+ "gears"+ gears);
    	
    }
    

}
