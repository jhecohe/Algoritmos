import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class LoveLetterMistery {

	@Test
	void converToPalindrom() {
//		String letter = "abc"; //2
//		String letter = "abcba";  //0
//		String letter = "abcd";   //4
		String letter = "cba";   //2
		
		System.out.println(31%2);
		int middle = (letter.length()/2) + letter.length()%2;
		
		char[] temp = letter.substring(0, letter.length()/2).toCharArray();
		char[] sl = letter.substring(middle).toCharArray();
		
		int counter = 0;
		
		char[] slr = new char[sl.length];
		
		int index = 0;
		for (int i = sl.length -1; i >= 0; i--) {
			slr[index] = sl[i];
			index++;
		}
		
		System.out.println(temp);
		System.out.println(slr);
		
		for (int i = 0; i < temp.length; i++) {
			int l = temp[i];
			int s = slr[i];
			System.out.println(l);
			System.out.println(s);
			if(l != s) {
				int diff = s - l;
				s = s - diff;
				counter += Math.abs(diff);
			}
		}
		
		System.out.println(counter);
	}
}
