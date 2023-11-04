package InterviewSampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeElementFromList {

	public static void main(String[] args) {
		removeANumberFromList();
		System.out.println("--------------------------------------------------------");
		removeStringFromList();
	}

	public static void removeANumberFromList() {
		int[] array = { 10, 20, 30, 30, 40, 50, 90, 20, 60, 70, 30 };

		int numberToRemoveFromList = 30;

		List<Integer> list = new ArrayList<Integer>();

		for (int a : array) {
			list.add(a);
		}
		System.out.println("Before removing " + numberToRemoveFromList + " List is : " + list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == numberToRemoveFromList) {
				list.remove(i);
				i--;
			}
		}
		System.out.println("After  removing " + numberToRemoveFromList + " List is : " + list);
	}

	public static void removeStringFromList() {
		List<String> inputList = Arrays.asList("ram", "rajesh", "kumar", "ramesh", "gupta", "kalwaar", "rohit","singh");
		String stringToRemove = "kalwaar";

		// We can not directly modify the "inputList", because Arrays.asList() method
		// We have to creates an immutable list
		// We have to first add this in a list then do modify that list

		ArrayList<String> list = new ArrayList<>();
		list.addAll(inputList);

		System.out.println("List Before Removing String \"" + stringToRemove + "\" : " + list);
		
		list.remove(stringToRemove);

		System.out.println("List After  Removing String \"" + stringToRemove + "\" : " + list);
	}
}
