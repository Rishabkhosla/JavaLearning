package com.learn.java;

public class PersonJob {

	private Job job;
	public PersonJob(){
		this.job=new Job();
		job.setId(0);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PersonJob rr=new PersonJob();
    System.out.println(rr.job.getId());
		
	}

}
