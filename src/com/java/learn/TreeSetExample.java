package com.java.learn;
import java.util.*;
public class TreeSetExample  {

	public static void main(String[] args) {
		TreeSet<Student> set= new TreeSet<Student>();
		Student r1=new Student("John", 22, 52200);
		Student r2=new Student("Amanda", 30, 51200);
		Student r3=new Student("Mary", 31, 59900);
		Student r4=new Student("Jonathan", 30,45500);
		Student r5=new Student("Ram", 23, 52300);
		Student r6=new Student("Mike", 32, 54500);
		Student r7=new Student("Cheng", 31, 51500);
		set.add(r1);
		set.add(r2);
		set.add(r3);
		set.add(r4);
		set.add(r5);
		set.add(r6);
		set.add(r7);
		for(Student rr:set)
			System.out.println(rr.name+" "+rr.age+" "+rr.salary);
			
		
			
		}

	
	
	}
		
		
		
		
		
	


