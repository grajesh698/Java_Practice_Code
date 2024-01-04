package InterviewSampleCode2;

public class CycleLength_Floyd_Tortoise {

	public static int countLengthOfCycle(int[] arr, int startIndex) {
		int N = arr.length;

		// Check if the startIndex is out of bounds
		if (startIndex < 0 || startIndex >= N) {
			return -1;
		}

		boolean[] visited = new boolean[N];
		int count = 0;

		while (!visited[startIndex]) {
			visited[startIndex] = true;
			count++;
			startIndex = arr[startIndex];

			// Check for cases where the cycle length exceeds the array size
			if (startIndex < 0 || startIndex >= N) {
				return -1;
			}
		}

		return count > 1 ? count : -1;
	}

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
}
