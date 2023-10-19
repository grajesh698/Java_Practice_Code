package InterviewSampleCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class secondHighestNumberInArrayWithoutSorting {

	public static void main(String[] args) {
		// int arr[] = { 100, 14, 46, 47, 94, 94, 152, 152, 86, 36, 194, 89 };
		int arr[] = { 642, 642, 642, 642, 642, 642, 642 };
		List<Integer> list = new ArrayList<>();
		for (Integer i : arr) {
			list.add(i);
		}
		System.out.println("Approach 1:\nGiven Array is : " + list);

		// Approach 1: Not 100% correct
		Integer a = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		list.remove(a);
		Integer b = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Second largest Number in Array is : " + b);

		// Approach 2: Not 100% correct
		System.out.println("Approach 2:\nGiven Array is : " + list);
		int max = Collections.max(list);
		list.remove(list.indexOf(max));
		int secondMax = Collections.max(list);
		System.out.println("Second largest Number in Array is : " + secondMax);

		// Approach 3: 100% correct
		Set<Integer> set = new HashSet<Integer>();
		for (Integer i : arr) {
			set.add(i);
		}
		System.out.println("Approach 3:\nGiven Array is : " + set);

		if (set.size() > 1) {
			int max2 = Collections.max(set);
			set.remove(max2);
			int secondMax2 = Collections.max(set);
			System.out.println("Second largest Number in Array is : " + secondMax2);
		} else
			System.out.println("-1");
	}
}