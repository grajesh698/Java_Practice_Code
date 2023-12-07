package InterviewSampleCode;

import java.util.ArrayList;
import java.util.List;
//Input : 1,0,3,2,0,4,5,0
//Output: 1,3,0,0,0,2,4,5
public class InsertZeroAtMiddleOfList {
	public static void main(String[] args) {
		
		int[] arr = { 1, 0, 3, 2, 0, 4, 5, 0 };
		List<Integer> list = new ArrayList<>();
		List<Integer> noZerolist = new ArrayList<>();

		for (int i : arr) {
			list.add(i);
		}
		System.out.println(list);
		int count = 0;

		for (Integer num : list) {
			if (num != 0) {
				noZerolist.add(num);
			} else {
				count++;
			}
		}
		int mid = noZerolist.size() / 2;
		list.clear();
		list.addAll(noZerolist);
		for (int i = 0; i < count; i++) {
			list.add(mid, 0);
		}
		System.out.println(list);
	}
}