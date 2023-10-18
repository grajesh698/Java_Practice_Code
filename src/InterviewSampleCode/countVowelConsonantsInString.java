package InterviewSampleCode;

public class countVowelConsonantsInString {

	public static void main(String[] args) {
		String str = "rAjeshkumar";
		count(str);
	}

	public static void count(String input) {
		int vowelCount = 0;
		int consonentCount = 0;
		String str = input.toLowerCase().trim();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount += 1;
			} else {
				consonentCount += 1;
			}
		}
		System.out.println("Vowel count in String " + str + " : " + vowelCount);
		System.out.println("Const count in String " + str + " : " + consonentCount);
	}
}