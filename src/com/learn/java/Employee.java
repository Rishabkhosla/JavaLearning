package com.learn.java;

public class Employee {
  int id;
 String name;
 EmpAddress address;
 public Employee(int id,String name,EmpAddress address){
	 this.id=id;
	 this.name=name;
	 this.address=address;
	 
	 
 }
 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpAddress address1= new EmpAddress("gurdaspur","punjab","india");
		EmpAddress address2= new EmpAddress("amritsar","punjab","india");
		Employee e1=new Employee(1,"rishab",address1);
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.address.city);

	}

}
