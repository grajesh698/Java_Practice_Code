package InterviewSampleCode;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the first non-repeated character in string using Stream functions?
//Input- String S1="is found in this line"; 
//output- f

public class firstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "is found in this line";
		BruteForceMethod(input);
		NormalCompareMethod(input);
		UsingJava8Stream(input);
	}

	public static void BruteForceMethod(String input) {
		System.out.println("BruteForceMethod");
		char[] ch = input.toCharArray();
		char x = ' ';
		for (char c : ch) {
			if (input.indexOf(c) == input.lastIndexOf(c)) {
				x = c;
				break;
			}
		}
		if (x == ' ' || input.isEmpty() || input == null)
			System.out.println("Either String is empty OR All char are repeating..!");
		else
			System.out.println("First Non repeating character in given string is : " + x);
	}

	public static void NormalCompareMethod(String input) {
		System.out.println("NormalCompareMethod");
		boolean found = false;
		for (int i = 0; i < input.length(); i++) {
			found = true;
			char c = input.charAt(i);
			for (int j = 0; j < input.length(); j++) {
				if (c == input.charAt(j) && j != i) {
					found = false;
					break;
				}
			}
			if (found) {
				System.out.println("First Non repeating character in given string is : " + c);
				break;
			}
		}
	}

	public static void UsingJava8Stream(String input) {
		System.out.println("UsingJava8Stream");
		char result = input.chars()
				.mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(e -> e.getKey())
				.findFirst()
				.get();
		System.out.println("First Non repeating character in given string is : " + result);
	}
}
