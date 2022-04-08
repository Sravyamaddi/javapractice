package com.javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCharFinder {

	public static void main(String args[]) {
		
		Map<Character, Integer> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		Boolean repeatedChar = false;
		try {
			for (char letter : str.trim().toCharArray()) {
				if (map.containsKey(letter)) {
					map.put(letter, map.get(letter) + 1);
				} else {
					map.put(letter, 1);
				}
			}
			for (Entry<Character, Integer> m : map.entrySet()) {
				if (m.getValue() > 1) {
					System.out.println(m.getKey().toString() + "-" + m.getValue() + "times");
					repeatedChar = true;
				}
			}
			if (!repeatedChar) {
				System.out.println("No repeated characters in given word");
			}
		} catch (Exception e) {
			System.err.printf("Exception in finding duplicate word" + str, e);
		} finally {
			scanner.close();
		}
	}

}
