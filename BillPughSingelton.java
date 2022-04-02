package com.javapractice;

public class BillPughSingelton {
	
	private  BillPughSingelton() {
		
	}
	
	private static class InstanceClass{
		private static final BillPughSingelton instance = new BillPughSingelton();
	}
	public static BillPughSingelton getInstance() {
		return InstanceClass.instance;
	}
	
	
	public static void main(String args[]) {
		System.out.println( BillPughSingelton.getInstance());
		System.out.println( BillPughSingelton.getInstance());
	}

}
