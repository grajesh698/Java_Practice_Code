package InterviewSampleCode;

import java.util.Scanner;

public class reverseStringWithoutInBuildFunctions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char ch = 0;
		System.out.print("Original String: ");
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		System.out.print("Reversed String: ");
		for (int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(i);
			System.out.print(ch);
		}
		sc.close();
	}
}