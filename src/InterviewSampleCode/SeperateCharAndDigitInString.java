package InterviewSampleCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//Input String s = {cha3n7dra1ay9an3};
//Output = {chandraayan1379}

public class SeperateCharAndDigitInString {
	public static void main(String[] args) {
		String s = "cha3n7dra1ay9an3";

		List<Character> chars1 = new ArrayList<>();
		Set<Character> digits1 = new TreeSet<>();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				digits1.add(s.charAt(i));
			} else
				chars1.add(s.charAt(i));
		}

		chars1.addAll(digits1);
		for (Character c : chars1) {
			System.out.print(c);
		}

		System.out.println("\n----------------");

		// Using Java 8 method

		List<Character> chars2 = s.chars().mapToObj(c -> (char) c).filter(c -> !Character.isDigit(c))
				.collect(Collectors.toList());
		Set<Character> digits2 = s.chars().mapToObj(c -> (char) c).filter(c -> Character.isDigit(c))
				.collect(Collectors.toSet());
		chars2.addAll(digits2);
		chars2.stream().forEach(System.out::print);
		
	}
}
