package InterviewSampleCode;

public class checkArmStrongNumber {
	
	//Example 1: Armstrong Number: 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634
	//Example 2: Armstrong Number: 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
	
	//Example 2: Not a Armstrong Number: 21 = 2*2 + 1*1 = 4 + 1 = 5

	public static void main(String[] args) {

		int num = 1634;
		int temp, reminder, result = 0;
		
		String str = Integer.toString(num);
		int lenghtOfNumber=str.length();
		
		temp = num;
		while (temp != 0) {
			reminder = temp % 10;
			temp = temp / 10;
			result += Math.pow(reminder, lenghtOfNumber);
		}
		if (num == result)
			System.out.println(num + " is a Armstrong Number!");
		else
			System.out.println(num + " is not a Armstrong Number!");
	}
}