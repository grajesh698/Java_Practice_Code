package InterviewSampleCode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDuplicateCharacterInString {

	public static void main(String[] args) {
		String str = "raamamraj";
		countDuplicateCharsInString(str);
	}

	public static void countDuplicateCharsInString(String str) {
		
		//First Approcah using normal Java
		
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
		
		System.out.println("=====================================");
		
		//Second Approach using Java 8
		
		Map<Character, Long> map2 = str.chars()
				   .mapToObj(c -> (char) c)
				   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map2);
	}
}
