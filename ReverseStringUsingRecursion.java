package com.javapractice;

public class ReverseStringUsingRecursion {

	static String result = "";

	public void reverse(String str) {

		if ((str == null) || (str.length() < 1)) {
			System.out.println(str);
		} else {
			result = result + str.charAt(str.length() - 1);
			// System.out.println(str.charAt(str.length() - 1));
			reverse(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String args[]) {

		ReverseStringUsingRecursion reverseObj = new ReverseStringUsingRecursion();

		try {
			reverseObj.reverse("Tradier");
			System.out.print("Result is :" + result);
		} catch (Exception e) {
			System.out.printf("exception in recursion", e);
		}

	}

}
