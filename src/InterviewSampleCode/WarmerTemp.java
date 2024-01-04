package InterviewSampleCode;

/*
Given a list arr[] of everyday temperatures. For each day,The task is to find the count of days remaining for 
the next day with warmer temperatures.If there is no such day for which warmer temperature is possible then print -1.

Examples: Input: arr[] = {73, 74, 75, 71, 69, 72, 76, 73}
Output: {1, 1, 4, 2, 1, 1, -1, -1}
*/

import java.util.Arrays;

public class WarmerTemp {
	public static void main(String[] args) {
		int arr[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
		warmerday(arr);
	}

	public static void warmerday(int arr[]) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			result[i] = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					result[i] = j - i;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
