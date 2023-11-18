package InterviewSampleCode;

import java.util.Arrays;

/* 
Split the Array in given splitSize
Input : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
expected Output:[0, 1, 2]
				[3, 4, 5]
				[6, 7, 8]
				[9]	
*/

public class splitArraytoSpecificSize {

	public static void main(String[] args) {
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;
		for (int i = 0; i < original.length; i += splitSize) {
			System.out.println(
					Arrays.toString(Arrays.copyOfRange(original, i, Math.min(original.length, i + splitSize))));
		}

	}
}