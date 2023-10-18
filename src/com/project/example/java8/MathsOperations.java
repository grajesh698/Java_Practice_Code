package com.project.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MathsOperations {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(10, 5, 8, 33, 90, 32, 12, 7, 45, 3);

		// Find minimum element in the List
		int min = input.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum number: " + min);

		// Find maximum element in the list
		int max = input.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum number: " + max);

		// Multiply 3 to all elements in the list
		List<Integer> newList = input.stream().map(s -> s * 3).collect(Collectors.toList());
		System.out.println("New List: " + newList);

		// Add all elements in the list
		int sum = 0;
		Iterator<Integer> itr = input.iterator();
		while (itr.hasNext()) {
			sum = sum + itr.next();
		}
		System.out.println("Sum of List: " + sum);
		
		//Using Java8 Sum of all list
		int sumList = input.stream().mapToInt(Integer::valueOf).sum();
		System.out.println("Sum of List: " + sumList);

		// Sorting of list
		input.stream().sorted().collect(Collectors.toList()).forEach(s->System.out.print(s+" "));
	}
}
