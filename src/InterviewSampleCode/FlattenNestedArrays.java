package InterviewSampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenNestedArrays {
	public static void main(String[] args) throws Exception {
		Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };

		System.out.println(Arrays.toString(flatten(array).toArray()));

		System.out.println("----------------Second Approach for Integer Input----------------");

		System.out.println(Arrays.toString(flatten2(array)));

	}

	public static Stream<Object> flatten(Object[] inputArray) {

		return Arrays.stream(inputArray).flatMap(o -> o instanceof Object[] a ? flatten(a) : Stream.of(o));
	}

	// -------------------Second Approach for Integer Input--------------------------------//

	public static Integer[] flatten2(Object[] inputArray) throws Exception {

		if (inputArray == null)
			return null;

		List<Integer> list = new ArrayList<Integer>();

		for (Object element : inputArray) {
			if (element instanceof Integer) {
				list.add((Integer) element);
			} else {
				list.addAll(Arrays.asList(flatten2((Object[]) element)));
			}
		}
		return list.toArray(new Integer[list.size()]);
	}
}