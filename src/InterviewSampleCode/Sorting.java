package InterviewSampleCode;

import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		normalSorting();
		System.out.println("\n-----------------------------");
		listOfStringSorting();
	}

	// Normal Sorting of integers with out inbuild functions

	public static void normalSorting() {
		System.out.println("Normal Sorting of integers with out inbuild functions");
		int[] arr = { 9, 5, 1, 2, 4, 3 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}

	// Sorting of List of String using Java 8
	public static void listOfStringSorting() {
		System.out.println("Sorting of List of String using Java 8");
		List<String> String_list = Arrays.asList("10", "12", "3", "9", "49");

		String_list.stream().map(Integer::valueOf).sorted().forEach(s -> System.out.print(s + " "));
	}

}