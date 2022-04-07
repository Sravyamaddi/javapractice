package com.javapractice;

import java.util.Scanner;

public class NumberPyramidWithZero {

	/*
	 * 0001000 
	 * 0023200 
	 * 0345430
	 * 4567654
	 */

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int noofLines = sc.nextInt();
		int max = 2 * noofLines - 1;
		int temp;
		try {
			for (int c = 1; c <= noofLines; c++) {// columns
				
				for (int z = 0; z < max /2-c+ 1; z++) {// zero
					System.out.print("0 ");
				}
				temp = c;
				for (int i = 0; i < c; i++) {// increasing number
					System.out.print(temp + " ");
					temp++;
				}
				temp = temp - 2;
				for (int d = 0; d < c - 1; d++) {// decreasing number
					System.out.print(temp + " ");
					temp--;
				}
				for (int z = 0; z < max /2-c+ 1; z++) {// zero
					System.out.print("0 ");
				}
				System.out.println();
			}
		}
		finally {
			sc.close();
		}
	}	
}
