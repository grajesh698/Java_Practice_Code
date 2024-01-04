package InterviewSampleCode2;

public class LongestUniformSubstring {
	public static void main(String[] args) {
		String input = "abbbccdddd";
		String longestUniformSubstring = findLongestUniformSubstring(input);
		System.out.println("Longest Uniform Substring: " + longestUniformSubstring);
	}

	public static String findLongestUniformSubstring(String input) {
		if (input == null || input.length() == 0) {
			return "";
		}

		int start = 0;
		int end = 0;
		int currentStart = 0;
		int currentLength = 1;
		int maxLength = 1;

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				currentLength++;
			} else {
				currentStart = i;
				currentLength = 1;
			}

			if (currentLength > maxLength) {
				maxLength = currentLength;
				start = currentStart;
				end = i;
			}
		}

		return input.substring(start, end + 1);
	}
}
