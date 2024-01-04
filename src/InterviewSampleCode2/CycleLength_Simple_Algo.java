package InterviewSampleCode2;

import java.util.HashSet;

public class CycleLength_Simple_Algo {

	public static void main(String[] args) {
		int[] arr1 = { 1, 0 };
		int[] arr2 = { 1, 2, 0 };
		int[] arr3 = { 2, 3 };
		int[] arr4 = { 2, 3, 2, 0 };

		System.out.println(countLengthOfCycle(arr1, 0)); // Output: 2
		System.out.println(countLengthOfCycle(arr2, 0)); // Output: 3
		System.out.println(countLengthOfCycle(arr3, 3)); // Output: -1
		System.out.println(countLengthOfCycle(arr4, 1)); // Output: 3
	}

	public static int countLengthOfCycle(int[] arr, int startIndex) {
		int n = arr.length;
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;

		while (startIndex >= 0 && startIndex < n && !visited.contains(startIndex)) {
			visited.add(startIndex);
			startIndex = arr[startIndex];
			count++;
		}

		if (startIndex >= 0 && startIndex < n && visited.contains(startIndex)) {
			// Cycle found
			return count;
		} else {
			// No cycle found
			return -1;
		}
	}
}
