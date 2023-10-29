package com.project.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenAndOddFilterFormList {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();

		input.stream().forEach(a -> {
			if (a % 2 == 0) {
				evenList.add(a);
			} else {
				oddList.add(a);
			}
		});
		System.out.println("Even Numbers : " + evenList);
		System.out.println("Odd  Numbers : " + oddList);

	}
}