package InterviewSampleCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SomeJava8Example {
	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		System.out.println("------------------------------------------\nNumbers starting with 1 in a List");
		myList.stream().map(s -> s.toString()).filter(s -> s.startsWith("1")).forEach(s -> System.out.print(s + " "));

		System.out.println("\n------------------------------------------\nDuplicate elements in a List");
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(s -> !set.add(s)).forEach(s -> System.out.print(s + " "));

		System.out.println("\n------------------------------------------\nFind the first element of the list");
		myList.stream().limit(1).toList().forEach(System.out::print);
		System.out.println("\nBy Second Apporach");
		myList.stream().findFirst().ifPresent(System.out::print);

		System.out.println("\n------------------------------------------\nFind the Sum of all element in the list");
		System.out.print(myList.stream().mapToInt(i -> i).sum());

		System.out.println("\n------------------------------------------\nFind the Max element in the list");
		myList.stream().mapToInt(i -> i).max().ifPresent(System.out::print);
		System.out.println("\nBy Second Apporach");
		System.out.print(myList.stream().max(Integer::compare).get());

		System.out.println("\n------------------------------------------\nSort the element in the list--Natural Order");
		myList.stream().sorted(Comparator.naturalOrder()).forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println("Sort the element in the list--Reverse Order");
		myList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));

		System.out
				.println("\n------------------------------------------\nCheck element present atleast twice in Array");
		int[] arr = { 1, 2, 3, 4, 1 };
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Set<Integer> s = new HashSet<>(list);
		if (s.size() == list.size())
			System.out.print("False");
		else
			System.out.print("True");

		System.out.println("\n------------------------------------------\nConcate 2 List by convering them to Stream");
		Stream.concat(myList.stream(), myList.stream()).forEach(w -> System.out.print(w + " "));
		System.out.println("\nBy Second Apporach");
		Stream.of(myList.stream(), myList.stream()).flatMap(Function.identity()).forEach(w -> System.out.print(w + " "));
	}
}
