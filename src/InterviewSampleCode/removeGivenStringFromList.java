package InterviewSampleCode;

import java.util.*;

public class removeGivenStringFromList {

	public static void main(String[] args) {

		List<String> inputList = Arrays.asList("ram", "rajesh", "kumar", "ramesh", "gupta", "kalwaar", "rohit", "singh");
		String stringToRemove = "kalwaar";

		//We can not directly modify the "inputList", because Arrays.asList() method creates an immutable list
		//We have to first add this in a list then do modify that list
		
		ArrayList<String> list = new ArrayList<>();
		list.addAll(inputList);

		System.out.println("List Before Removing String \"" + stringToRemove + "\" : " + list);
		
		list.remove(stringToRemove);
		
		System.out.println("List After  Removing String \"" + stringToRemove + "\" : " + list);
	}
}
