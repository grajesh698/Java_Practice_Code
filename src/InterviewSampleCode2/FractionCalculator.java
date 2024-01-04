package InterviewSampleCode2;

public class FractionCalculator {
	public static void main(String[] args) {
		int[] fraction1 = { 3, 4 }; // Represents 3/4
		int[] fraction2 = { 1, 2 }; // Represents 1/2

		int[] difference = subtractFractions(fraction1, fraction2);

		System.out.println("Fraction 1: " + fraction1[0] + "/" + fraction1[1]);
		System.out.println("Fraction 2: " + fraction2[0] + "/" + fraction2[1]);
		System.out.println("Difference: " + difference[0] + "/" + difference[1]);
	}

	public static int[] subtractFractions(int[] fraction1, int[] fraction2) {
		// Ensure denominators are not zero
		if (fraction1[1] == 0 || fraction2[1] == 0) {
			throw new IllegalArgumentException("Denominator cannot be zero");
		}

		// Calculate the common denominator
		int commonDenominator = fraction1[1] * fraction2[1];

		// Calculate the numerators with the common denominator
		int numerator1 = fraction1[0] * fraction2[1];
		int numerator2 = fraction2[0] * fraction1[1];

		// Calculate the difference
		int differenceNumerator = numerator1 - numerator2;

		// Simplify the result
		int gcd = findGCD(differenceNumerator, commonDenominator);
		int[] simplifiedDifference = { differenceNumerator / gcd, commonDenominator / gcd };

		return simplifiedDifference;
	}

	// Helper method to find the Greatest Common Divisor (GCD)
	private static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return Math.abs(a);
	}
}
