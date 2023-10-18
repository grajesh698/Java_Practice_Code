package InterviewSampleCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class countNumberOfWordsInString {

	public static void main(String[] args) {
		String str = "Hello good good morning and welcome to the java class!";
		System.out.println(str);
		countWordsInString(str);
		countWordsInStringUsingHashMap(str);
		countWordsInStringUsingStream(str);
	}

	public static void countWordsInString(String str) {
		String[] s = str.split(" ");
		List<String> st = Arrays.asList(s);
		System.out.println("Count of words in string: " + st.size());
	}

	public static void countWordsInStringUsingHashMap(String str) {
		String[] s = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s.length; i++) {
			if (map.containsKey(s[i])) {
				int count = map.get(s[i]);
				map.put(s[i], count + 1);
			} else {
				map.put(s[i], 1);
			}
		}
		System.out.println("Count of words in string using HashMap: " + map);
	}

	public static void countWordsInStringUsingStream(String str) {
		String[] s = str.split(" ");
		List<String> st = Arrays.asList(s);
		long count = st.stream().count();
		System.out.println("Count of words in string using stream: " + count);
	}
}
