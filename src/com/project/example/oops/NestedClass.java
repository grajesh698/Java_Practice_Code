package com.project.example.oops;

public class NestedClass {
	private int age = 28;
	private String name = "Rajesh";

	public class test1 {
		public void msg() {
			System.out.println("My Name is: " + name);
		}
	}

	public class test2 {
		public void msg() {
			System.out.println("My age is: " + age);
		}
	}

	public static void main(String[] args) {
		NestedClass t = new NestedClass();

		NestedClass.test1 t1 = t.new test1();
		t1.msg();

		NestedClass.test2 t2 = t.new test2();
		t2.msg();
	}
}
