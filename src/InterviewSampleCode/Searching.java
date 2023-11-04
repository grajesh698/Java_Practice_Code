package InterviewSampleCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Searching {

	public static void main(String[] args) {
		int[] arr = { 9, 5, 1, 2, 4, 3 };
		int key = 2;
		NoramalSearch(arr, key);
		System.out.println("-------------------------------------------------------");
		Java8Search(arr, key);
	}

	public static void NoramalSearch(int[] arr, int key) {
		System.out.println("Normal Searching of integers with out inbuild functions\n");
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
				break;
			} else {
				index = -1;
			}
		}
		if (index >= 0) {
			System.out.println("Searching element " + key + " availabe at index : " + index);
		} else {
			System.out.println("Searching element " + key + " is not available in List");
		}
	}

	public static void Java8Search(int[] arr, int key) {
		System.out.println("Searching of integers with inbuild functions\n");

		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}

		int index = Collections.binarySearch(list, key);

		if (index >= 0) {
			System.out.println("Searching element " + key + " availabe at index : " + index);
		} else {
			System.out.println("Searching element " + key + " is not available in List");
		}

	}
}
