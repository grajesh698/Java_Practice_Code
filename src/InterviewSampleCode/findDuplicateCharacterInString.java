package InterviewSampleCode;

import java.util.HashMap;

public class findDuplicateCharacterInString {

	public static void main(String[] args) {
		String str = "raamamraj";
		countDuplicateCharsInString(str);
	}

	public static void countDuplicateCharsInString(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {
			if (map.containsKey(c)) {
				count = map.get(c);
				map.put(c, count + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
