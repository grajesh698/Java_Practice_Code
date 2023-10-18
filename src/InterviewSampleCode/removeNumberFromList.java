package InterviewSampleCode;

import java.util.ArrayList;
import java.util.List;

public class removeNumberFromList {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 30, 40, 50, 90, 20, 60, 70, 30 };
		
		int numberToRemoveFromList = 30;

		List<Integer> list = new ArrayList<Integer>();

		for (int a : array) {
			list.add(a);
		}
		System.out.println("Before removing "+numberToRemoveFromList+" List is : " + list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == numberToRemoveFromList) {
				list.remove(i);
				i--;
			}
		}
		System.out.println("After  removing "+numberToRemoveFromList+" List is : " + list);
	}
}
