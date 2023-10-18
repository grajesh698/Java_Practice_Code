package InterviewSampleCode;

import java.util.*;

public class missingNumberInArray {

	public static void main(String[] args) {

		int array[] = { 1,2,3,5 };
		int n = 5;
		System.out.println(missingNumber1(array, n));
		System.out.println("----------------------");
		System.out.println(missingNumber2(array, n));
	}

	public static int missingNumber1(int array[], int n) {
		int i, total;
		n = n - 1;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= array[i];
		return total;
	}

	public static int missingNumber2(int array[], int n) {

		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : array) {
			list.add(i);
		}
		Collections.sort(list);
		Iterator<Integer> itr = list.iterator();
		int i = 0;
		while (itr.hasNext()) {
			for (i = 1; i < n; i++) {
				if (i != itr.next()) {
					return i;
				}
			}
		}
		return i;
	}

}