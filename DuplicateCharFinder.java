package com.javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCharFinder {

	
	public static void duplicateFinder(){
		Map<Character , Integer> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		try {
			for(char c: str.trim().toCharArray()){
				if(map.containsKey(c)){
					map.put(c,map.get(c)+1);
				}else{
					map.put(c, 1);
				}
			}
			for(Entry<Character, Integer> m :map.entrySet() ){
				if(m.getValue() > 1){
					System.out.println(m.getKey().toString() + "-" + m.getValue() + "times");
				}
			}
			//System.out.println(str);
		}
		catch(Exception e) {
			System.err.printf("Exception in finding duplicate word"+str ,e);
		}
		finally {
			s.close();
		}
	}
	
	public static void main(String args[]){
		duplicateFinder();
	}
	
}
