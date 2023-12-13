package InterviewSampleCode;

/*
In an array, elements are considered to be “leaders” 
when their value is greater than the sum of all the elements to their right side. 
Write a method or function that, given an array of natural numbers, 
will return all the “leaders” present in the array.
If there are no leaders in the array, the method / function should return an empty array

Examples Given the arrays: {7, 8, 9, 0} returns {9}. {18, 19, 9, 2, 1} returns {19, 9, 2}
*/

public class LeaderNumber {
	public static void leadersNumber(int[] arr) {
		int right = 0;

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > right) {
				System.out.print(arr[i] + " ");
			}
			right = right + arr[i];
		}
	}

	public static void main(String[] args) {
		//int[] array = { 7, 8, 9, 0 };
		int[] array2 = { 18, 19, 9, 2, 1 };
		leadersNumber(array2);
	}
}
