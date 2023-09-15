import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class Anagrams {

	@Test
	public void sherlockAndAnagrams() {
		// Write your code here
		String s = "aabbccddeefghi";
		HashMap<String, Integer> pairs = new HashMap<>();
		for (int i = 0; i < s.toCharArray().length; i++) {
			char[] subA = s.substring(0, i).toCharArray();
			for (int j = i; j < subA.length; j++) {
				char[] temp = {s.charAt(i),s.charAt(j)};
				Arrays.sort(temp);
				String subS = new String(temp);
				System.out.println(subS);
				if(pairs.get(subS) == null) pairs.put(subS, 1);
				else if(pairs.get(subS) > 0) pairs.put(subS, pairs.get(subS)+1);
			}
			System.out.println(pairs);
		}
		int counter = 0;
		for (Map.Entry<String, Integer> entry : pairs.entrySet()) {
			if(entry.getValue() > 1) counter += entry.getValue()/2;
		}
		
		assertEquals(5, counter);
	}
}
