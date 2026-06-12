package streams;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class FunnyString {

	@Test
	void validateStrings() {
		String funny = "lmnop";
		
		String reversed = new StringBuilder(funny).reverse().toString();

        // Check if all adjacent difference pairs match up in both directions
        boolean isFunny = IntStream.range(0, funny.length() - 1)
                .allMatch(i -> Math.abs(funny.charAt(i) - funny.charAt(i + 1)) 
                            == Math.abs(reversed.charAt(i) - reversed.charAt(i + 1)));

		System.out.println(isFunny ? "Funny" : "Not Funny");
	}
}



/**
 * In this challenge, you will determine whether a string is funny or not. 
 * To determine whether a string is funny, create a copy of the string in reverse 
 * e.g. . Iterating through each string, compare the absolute difference in the ascii
 * values of the characters at positions 0 and 1, 1 and 2 and so on to the end. 
 * If the list of absolute differences is the same for both strings, they are funny.

Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

Example

s = "lmnop"

The ordinal values of the charcters are [108, 109, 110, 111, 112]. 
and the ordinals are [112, 111, 110, 109, 108]. 
The absolute differences of the adjacent elements for both strings are [1, 1, 1, 1], 
so the answer is Funny.

Function Description

Complete the funnyString function in the editor below.

funnyString has the following parameter(s):

    string s: a string to test

Returns

    string: either Funny or Not Funny

 */
