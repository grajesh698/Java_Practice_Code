package InterviewSampleCode;

import java.util.*;

public class ParanthesisValidator {
	public static void main(String[] args) {
		String str = "([])";
		if (isValid(str))
			System.out.println("Correct pattern");
		else
			System.out.println("Wrong pattern");
	}

	public static boolean isValid(String str) {

		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				char t = stack.pop();
				if (!map.containsKey(t) || map.get(t) != c) {
					return false;
				}
			}
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}
}