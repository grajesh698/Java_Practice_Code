package InterviewSampleCode;

public class Swaping {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int temp = 0;
		swapTwoNumberUsingThirdVariable(x, y, temp);
		System.out.println("--------------------------------------------");
		swapTwoNumberWithoutUsingThirdVariable(x, y);
		System.out.println("--------------------------------------------");
		swapTwoNumberWithoutUsing3rdVariableSumAndSubstract(x, y);
	}

	public static void swapTwoNumberUsingThirdVariable(int x, int y, int temp) {
		System.out.println("Swapping Two Number Using Third Variable");
		System.out.println("Befor Swapping:  x= " + x + " and y= " + y);
		temp = x; // z--->10
		x = y; // x--->20
		y = temp; // y--->10
		System.out.println("After Swapping:  x= " + x + " and y= " + y);
	}

	public static void swapTwoNumberWithoutUsingThirdVariable(int x, int y) {
		System.out.println("Swapping Two Number Without Using Third Variable");
		System.out.println("Befor Swapping:  x= " + x + " and y= " + y);
		x = x + y; // x--->20+10=30
		y = x - y; // y--->30-20=10
		x = x - y; // x--->30-20=10
		System.out.println("After Swapping:  x= " + x + " and y= " + y);
	}

	public static void swapTwoNumberWithoutUsing3rdVariableSumAndSubstract(int x, int y) {
		System.out.println("Swapping Two Number Without Using 3d Variable, Addition and Substraction");
		System.out.println("Befor Swapping:  x= " + x + " and y= " + y);
		x = x ^ y; // x--->10^20=30
		y = x ^ y; // y--->30^20=10
		x = x ^ y; // x--->30^20=20
		System.out.println("After Swapping:  x= " + x + " and y= " + y);
	}
}
