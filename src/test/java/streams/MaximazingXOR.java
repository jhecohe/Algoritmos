package streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximazingXOR {

	@Test
	public void maximizingXor() {
		// https://www.hackerrank.com/challenges/maximizing-xor/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign&h_r=next-challenge&h_v=zen

		int l = 11;
		int r = 12;
		
		int max = Integer.MIN_VALUE;
		System.out.println(max);
		for (int i = l; i <= r; i++) {
			for (int j = l; j <= r; j++) {
				System.out.println("De value of "+i+" ^ "+j+" es "+ (i ^ j));
				if ((i ^ j) > max) {
					max = i ^ j;
				}
			}
		}
		//8421
		//1010
		//1011
		//0001
		
		assertEquals(7, max);
	}
}

/*
Givent two integers, l and r, find the maximal value of a xor b, written a ^ b, where a and b satisfy the following condition:
l <= a <= b <= r
For example, if l = 11 and r = 12, then the possible values of a and b are:

11 ^ 11 = 0
11 ^ 12 = 7
12 ^ 12 = 0

Our maximum value is 7.
Function Description
Complete the maximizingXor function in the editor below. It must return an integer representing the maximum value calculated.
maximizingXor has the following parameter(s):
l: an integer, the lower bound, inclusive
r: an integer, the upper bound, inclusive

Input Format
The first line contains the integer l.
The second line contains the integer r. 
 */