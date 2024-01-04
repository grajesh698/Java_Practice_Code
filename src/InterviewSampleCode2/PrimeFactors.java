package InterviewSampleCode2;

public class PrimeFactors {
	public static void main(String[] args) {
		int n = 30; // You can change 'n' to the desired range

		for (int i = 1; i <= n; i++) {
			System.out.print("Prime factors of " + i + ": ");
			printPrimeFactors(i);
			System.out.println();
		}
	}

	private static void printPrimeFactors(int number) {
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				// i is a prime factor of the number
				System.out.print(i + " ");
				number /= i;
			}
		}
	}
}
