package LeadCodeQuestions;

public class RemoveElement {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3 };
		int val = 3;

		removeElement(nums, val);
	}

	public static int removeElement(int[] nums, int val) {
		int count = 0;
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				count += 1;
			}else {
				nums[k] = nums[i];
				k++;
			}
		}
		System.out.println("Count of repeted digit: " + count);
		
		int m = k = nums.length - count;
		System.out.println("Count of non repeted digit: : " + m);
		return m;
	}
}
