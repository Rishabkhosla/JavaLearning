package com.learn.debug;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
			if(i==1||i==4){
				
			
			for(int k=0;k<=i-1;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=4;j++){
				
				System.out.print("*");
			}}
			else
			{
				for(int k=0;k<=i-1;k++){
					System.out.print(" ");
				}
				for(int j=1;j<=4;j++){
					if(j==1||j==5){
						System.out.print("*");
					}
				
					else{
						System.out.println(" ");
					}
				
			}
			System.out.println("\n");
		}
	

		}
