package InterviewSampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//Rearrange the array with positive and negative in alternate way
//Input : int arr[] = { 9, -2, -5, -4, 6, 7, -6, 8};
//Output: {9,-2,6,-5,7,-4,8,-6};

public class ReArrangeNegPosNumber {
	public static void main(String[] args) {
		int arr[] = { 9, -2, -5, -4, 6, 7, -6, 8 };

		method1(arr);
		method2(arr);
	}

//-----------------------------First Approach(This one is not 100% correct)------------------------------------------
	public static void method1(int arr[]) {

		int pos = 0;
		int neg = 1;
		int n = arr.length;
		int[] output = new int[n];

		for (int a : arr) {
			if (a >= 0) {
				output[pos] = a;
				pos += 2;
			} else {
				output[neg] = a;
				neg += 2;
			}
		}
		System.out.println(Arrays.toString(output));
	}

//-----------------------------Second Approach(This one is also not 100% correct)---------------------------------------
	public static void method2(int arr[]) {

		Stack<Integer> pos = new Stack<>();
		Stack<Integer> neg = new Stack<>();
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos.push(arr[i]);
			} else {
				neg.push(arr[i]);
			}
		}
		int tempArr[] = new int[arr.length];
		i = 0;
		int sizePos = pos.size();
		int sizeNeg = neg.size();
		while (i < tempArr.length) {
			if (sizePos > sizeNeg) {
				if (pos.size() > 0) {
					tempArr[i] = (int) pos.pop();
				}
				if (neg.size() > 0) {
					tempArr[i + 1] = (int) neg.pop();
					i++;
				}
			} else {
				if (neg.size() > 0) {
					tempArr[i] = (int) neg.pop();
				}
				if (pos.size() > 0) {
					tempArr[i + 1] = (int) pos.pop();
					i++;
				}
			}
			i++;
		}
		List<Integer> list = new ArrayList<>();
		for (int k = tempArr.length - 1; k >= 0; k--) {
			list.add(tempArr[k]);
		}
		System.out.println(list);
	}
}