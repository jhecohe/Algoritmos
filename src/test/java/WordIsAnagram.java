import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class WordIsAnagram {

	@Test
	void validateWordIsAnagram(){
		/*
		 * 
		 * 1. Write a function to determine whether a word is anagram of another 
		 * Two words are anagrams of one another if their letters can be rearranged to form the other word.

		For example: "top" y "pot"
		
		 */
		String word1 = "top";
		String word2 = "pot";
		
		char[] letters1 = word1.toCharArray();
		char[] letters2 = word2.toCharArray();
		
		HashMap<Character, Integer> first = new HashMap<Character, Integer>();
		HashMap<Character, Integer> first2 = new HashMap<Character, Integer>();
		
		for(int i = 0; i<letters1.length;i++) {
			if(first.containsKey(letters1[i])) {
				first.put(letters1[i], first.get(letters1[i])+1);
			} else
			{
				first.put(letters1[i], 1);
			}
		}
		
		for(int j = 0; j<letters2.length;j++) {
			if(first2.containsKey(letters2[j])) {
				first2.put(letters2[j], first2.get(letters2[j])+1);
			} else
			{
				first2.put(letters2[j], 1);
			}
		}
		
		System.out.println(first);
		System.out.println(first2);
		
		System.out.print(first.equals(first2) ? "anagram" : "Not anagram"); 
	}
}
