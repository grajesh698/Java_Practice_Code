package InterviewSampleCode;

import java.util.*;

public class reverseLinkedList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 4, 54, 23, 34, 12, 23, 50, 29);
		LinkedList<Integer> OriginalLinkedList = new LinkedList<Integer>();

		OriginalLinkedList.addAll(list);
		System.out.println("Original Linked List : " + OriginalLinkedList);

		LinkedList<Integer> reversedList = new LinkedList<Integer>();
		for (int i = OriginalLinkedList.size() - 1; i >= 0; i--) {
			reversedList.add(OriginalLinkedList.get(i));
		}
		System.out.println("Reversed Linked List : " + reversedList);
	}
}
