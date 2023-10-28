package InterviewSampleCode;

public class nearestNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 8, 8, 9 };

		int target = 3;

		int closest = arr[0];
		int closestDiff = Math.abs(target - closest);
		for (int i = 1; i < arr.length; i++) {
			int diff = Math.abs(target - arr[i]);
			if (diff < closestDiff) {
				closest = arr[i];
				closestDiff = diff;
			}
		}
		System.out.println("The closest number to " + target + " is " + closest);
	}
}