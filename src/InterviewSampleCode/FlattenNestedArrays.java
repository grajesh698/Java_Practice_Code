package InterviewSampleCode;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenNestedArrays {
	public static void main(String[] args) throws Exception {
		Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };
		Object[] flattenedArray = flatten(array).toArray();

		System.out.println(Arrays.toString(flattenedArray));

	}

	public static Stream<Object> flatten(Object[] inputArray) {

		return Arrays.stream(inputArray).flatMap(o -> o instanceof Object[] a ? flatten(a) : Stream.of(o));
	}
}