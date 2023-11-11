package InterviewSampleCode;

import java.util.Arrays;

//Input: Find the median of sorted array.
//If Arrays lenth is odd return the middle value, else return the avg of two middle values

public class MedianOfArrayWithCondition {
	public static void main(String[] args) {
		int[] arr = { 56, 67, 30, 79 };
		int[] arr2 = { 90, 100, 78, 89, 67 };
		Findmedian(arr);
		Findmedian(arr2);
	}

	public static int Findmedian(int[] v) {
		int N = v.length;
		Arrays.sort(v);
		int median = 0;
		if (v.length % 2 == 0) {
			int m1 = v[N / 2 - 1];
			int m2 = v[N / 2];
			median = (m1 + m2) / 2;
		} else {
			int n = N / 2;
			median = v[n];
		}
		System.out.println(median);
		return median;
	}
}
