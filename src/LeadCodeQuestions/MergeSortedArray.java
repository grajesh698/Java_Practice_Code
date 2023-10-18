package LeadCodeQuestions;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		MergeSortedArray mSort = new MergeSortedArray();
		
		int m = 3;
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		
		int n = 3;
		int[] nums2 = { 2, 5, 6 };

		mSort.merge(nums1, m, nums2, n);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int k = 0;
		for (int i = m; i < nums1.length; i++) {
			nums1[i] = nums2[k];
			k++;
		}
		System.out.println(Arrays.toString(nums1));
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}
}