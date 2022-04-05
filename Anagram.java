package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Anagram {

	public static void main(String arg[]) {
		
		try {
			String[] words = new String[] {"Sravya","dog", "elvis", "forest", "fortes", "foster", "goat","god", "heros", "horse", "lives", "shore", "softer"} ;
			//[dog, elvis, forest, fortes, foster, god, heros, horse, lives, shore, softer]
			Set<String> finalList = new TreeSet<>();
			for (String word : words) {
				Set<String> anagramWords = Arrays.stream(words).filter(w -> {
					if (w.length() == word.length() && !w.equalsIgnoreCase(word)) {
						char[] word_org = word.toCharArray();
						Arrays.sort(word_org);
						char[] w_org = w.toCharArray();
						Arrays.sort(w_org);
						//System.out.println("word : " + String.valueOf(word) + "," + "w :" + String.valueOf(w));
						return String.valueOf(word_org).equalsIgnoreCase(String.valueOf(w_org));
					}
					return false;
				}).collect(Collectors.toSet());
				finalList.addAll(anagramWords);
			}
			System.out.println(finalList);
		}catch(Exception e) {
			
			System.err.printf("Exception while sorting",e);
		}
		
		//sum of  prime numbers with java streams
		// int[] L1 ={1,2,3,4,5,6,7,8,9,10};
		// o/p : 1 + 9 + 25 + 49 + 81 ==> 165
		List<Integer> v = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		int sum = v.stream().filter(x -> x % 2 != 0).map(x -> x * x)
				.collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);

}
}
