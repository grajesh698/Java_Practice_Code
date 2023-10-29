package InterviewSampleCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reverseLinkedList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 4, 54, 23, 34, 12, 23, 50, 29);

		System.out.println("Original Linked List : " + list);
		System.out.println("=========================================");

		LinkedList<Integer> reversedList = new LinkedList<Integer>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}
		System.out.println("Reversed Linked List : " + reversedList);
		System.out.println("=========================================");

		// Using Java Collection

		Collections.reverse(list);
		System.out.println("Reversed Linked List : " + list);
		System.out.println("=========================================");

		// Using Java 8 Stream API
		List<Integer> list2 = Arrays.asList(10, 4, 54, 23, 34, 12, 23, 50, 29);
		List<Integer> reverseList = IntStream.range(0, list2.size())
											 .map(i -> list2.size() - 1 - i)
											 .mapToObj(list2::get)
											 .collect(Collectors.toList());
		System.out.println("Reversed Linked List : " + reverseList);
	}
}
