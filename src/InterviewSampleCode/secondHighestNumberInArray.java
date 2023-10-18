package InterviewSampleCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class secondHighestNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		List<Integer> list = new ArrayList<>();
		for (Integer i : arr) {
			list.add(i);
		}

		System.out.println("Given Array is : " + list);
		List<Integer> l2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Second largest Number in Array is: " + l2.get(l2.size() - 2));
	}
}