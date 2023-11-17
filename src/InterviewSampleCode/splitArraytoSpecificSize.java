package InterviewSampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

/* 
Split the Array in given splitSize
Input : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
expected Output:[0, 1, 2]
				[3, 4, 5]
				[6, 7, 8]
				[9]	
*/

public class splitArraytoSpecificSize {

	public static void main(String[] args) {
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;

		List<Integer[]> arrayParts = splitArray(ArrayUtils.toObject(original), splitSize);
		for (Integer[] o : arrayParts) {
			System.out.println(Arrays.toString(o));
		}

	}

	public static <T> List<T[]> splitArray(T[] array, int splitSize) {

		int numberOfArrays = array.length / splitSize;
		int remainder = array.length % splitSize;

		int start = 0;
		int end = 0;

		List<T[]> list = new ArrayList<T[]>();
		for (int i = 0; i < numberOfArrays; i++) {
			end += splitSize;
			list.add(Arrays.copyOfRange(array, start, end));
			start = end;
		}

		if (remainder > 0) {
			list.add(Arrays.copyOfRange(array, start, (start + remainder)));
		}
		return list;
	}
}