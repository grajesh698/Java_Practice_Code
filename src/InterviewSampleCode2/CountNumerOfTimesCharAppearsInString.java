package InterviewSampleCode2;

public class CountNumerOfTimesCharAppearsInString {
	// input- aaeattccc
	// output- 2a1e1a2t3c

	public static void main(String[] args) {
		String input = "aaeattccc";
		System.out.println(countChar(input));
	}

	public static String countChar(String input) {

		if (input.isEmpty() || input == null) {
			return "Provide some input...!";
		}

		if (input.length() == 1) {
			return '1' + input;
		}

		StringBuilder out = new StringBuilder();
		char previous = input.charAt(0);
		int count = 1;

		for (int i = 1; i < input.length(); i++) {
			char current = input.charAt(i);

			if (previous == current) {
				count++;
			} else {
				out.append(count).append(previous);
				previous = current;
				count = 1;
			}
		}
		String result = out.append(count).append(previous).toString();
		return result;
	}
}
