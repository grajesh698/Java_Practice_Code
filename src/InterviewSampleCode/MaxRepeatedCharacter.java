package InterviewSampleCode;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedCharacter {
	public static void main(String[] args) {
		String inputString = "aaabbbcbccabbdaa";
		if (inputString.length() == 0) {
			System.out.println("String is empty!");
		} else {
			findMaxRepeatedCharacter(inputString);
		}
	}

	private static void findMaxRepeatedCharacter(String str) {
		Map<Character, Integer> charCount = new HashMap<>();
		int maxCount = 0;

		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		for (int count : charCount.values()) {
			maxCount = Math.max(maxCount, count);
		}

		System.out.println(maxCount);

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() == maxCount) {
				for (int i = 0; i < maxCount; i++) {
					System.out.print(entry.getKey());
				}
				System.out.println();
			}
		}
	}
}
