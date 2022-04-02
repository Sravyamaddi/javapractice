package com.javapractice;

public class NumberandStarPattern {

	public static void main(String[] args) {
		int temp =  5 ;
		for(int i = 1 ; i<= 5 ; i++){

		   System.out.print(temp); 
		   
		  for(int j= 1 ; j <= i ; j++ ){
		   
		       System.out.print("*");         	   
		  
		  }
		  System.out.println(); 
		  temp--;
		}

	}

}
