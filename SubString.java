package com.javapractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SubString {
	
	public static void main(String args[]){
	String s = "emp1-www.google.com'11:03,emp2-www.facebook.com'12:05,emp3-www.google.com'12:05.........";
    String[] array = s.split(",|-|'");
    List<String> al = new ArrayList<String>();
    Map<String , Integer> map = new HashMap<String , Integer>();
    for(String str : array ){
    	if(str.contains("www")){
            al.add(str);
    	}
    	if(map.containsKey(str)){
			map.put(str,map.get(str)+1);
		}else{
			map.put(str,1);
		}
    }
	Integer highest = 0 ;
	String site = "";
	for(Entry<String, Integer> entry :map.entrySet() ){
		if(entry.getValue() > highest){
			 highest  = entry.getValue() ;
			 site = entry.getKey();
		}
	}
	 System.out.print("Most Visited Site is :"+site + "," + highest +" times it has been visited");
	
	}
}
