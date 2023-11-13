package InterviewTheoriticalQuestios;

//What will be the output of the following code?

class parent {
	public void walk() {
		System.out.println("Parent walk");
	}

	public void run() {
		System.out.println("Parent run");
		walk();
	}
}

class child extends parent {
	public void walk() {
		System.out.println("Child walk");
		super.walk();
	}

	public void run() {
		System.out.println("Child run");
		super.run();
	}
}

public class OutputOfCode_1 {

	public static void main(String[] args) {
		parent p = new child();
		p.run();
	}
}