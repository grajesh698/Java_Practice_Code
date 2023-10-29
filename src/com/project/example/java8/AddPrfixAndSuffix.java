package com.project.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrfixAndSuffix {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinedString = input.stream().collect(Collectors.joining(", ", "[", "]"));
		System.out.println(joinedString);
	}

}
