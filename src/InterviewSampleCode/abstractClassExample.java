package InterviewSampleCode;

public class abstractClassExample extends test {

	public static void main(String[] args) {
		abstractClassExample a = new abstractClassExample();
		a.Addition(10, 20);
		a.show();
		
		test.Substraction(20, 10);
	}

	@Override
	public int Addition(int a, int b) {
		System.out.println("Addition : " + (a + b));
		return a + b;
	}
}

abstract class test {

	public abstract int Addition(int a, int b);

	public void show() {
		Multiplication(10, 20);
		System.out.println("show Method...!");
	}

	private int Multiplication(int a, int b) {
		System.out.println("Multiplication : " + (a * b));
		return a * b;
	}

	public static void Substraction(int a, int b) {
		System.out.println("Substraction : " + (a - b));
	}
}