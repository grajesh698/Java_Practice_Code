package InterviewSampleCode;

public interface java8_Default_Static_Private_Interface {
	default void show(int a, int b) {
		System.out.println("Default Method");

		multiply(a, b);
	}

	public void square(int a);

	public static int sum(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
		return a + b;
	}

	private int multiply(int a, int b) {// need to call this from either Default or static method in same interface
		System.out.println("Multiply of " + a + " and " + b + " is : " + (a * b));// called in line number 7
		return a * b;
	}
}

class Main implements java8_Default_Static_Private_Interface {
	@Override
	public void square(int a) {
		System.out.println("Square of " + a + " is : " + (a * a));
	}

	public static void main(String[] args) {
		Main mains = new Main();
		mains.show(10, 20);
		mains.square(2);
		java8_Default_Static_Private_Interface.sum(10, 20);
	}
}