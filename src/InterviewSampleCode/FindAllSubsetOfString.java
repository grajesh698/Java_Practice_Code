package InterviewSampleCode;

//Find the all subset of string
//Input: "CODE"
//Output: [C, O, D, E, CO, OD, DE, COD, ODE, CODE]

public class FindAllSubsetOfString {

	public static void main(String[] args) {
		String input = "CODE";
		usingSubStringMethod(input);
		System.out.println("\n--------------------------------");
		withoutUsingSubStringMethod(input);
	}

	public static void usingSubStringMethod(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				String ch = input.substring(i, j);
				System.out.print(ch + " ");
			}
		}
	}

	public static void withoutUsingSubStringMethod(String input) {
		char[] str = input.toCharArray();
		for (int i = 1; i <= input.length(); i++) {
			for (int j = 0; j <= input.length() - i; j++) {
				int s = i + j - 1;
				for (int k = j; k <= s; k++) {
					System.out.print(str[k]);
				}
				System.out.print(" ");
			}
		}
	}
}