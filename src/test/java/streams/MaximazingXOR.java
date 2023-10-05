package streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximazingXOR {

	@Test
	public void maximizingXor() {
		// https://www.hackerrank.com/challenges/maximizing-xor/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign&h_r=next-challenge&h_v=zen

		int l = 10;
		int r = 15;
		
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
