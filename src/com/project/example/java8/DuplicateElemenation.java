package com.project.example.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElemenation {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Rajesh", "Kumar", "Gupta", "Rajesh");

		// Using Iterator
		Iterator<String> itr = input.iterator();
		Set<String> s = new HashSet<>();
		while (itr.hasNext())
			s.add(itr.next());
		System.out.println(s);

		// Using Java8
		input.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}

}
