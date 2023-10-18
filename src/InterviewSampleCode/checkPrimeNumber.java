package InterviewSampleCode;

public class checkPrimeNumber {

	public static void main(String[] args) {
		int num = 10;
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (num == 0 || num == 1 || isPrime == false) {
			System.out.println(num + " is not a Prime Number.");
		} else {
			System.out.println(num + " is a Prime Number.");
		}
	}
}