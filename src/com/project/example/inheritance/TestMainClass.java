package com.project.example.inheritance;

public class TestMainClass {
	public static void main(String[] args) {

		MountainBike mb = new MountainBike(50, 3, 10);
		System.out.println(mb.toString());

		B b = new B();
		b.print_test_A();
		b.print_test_B();

		C c = new C();
		c.print_test_A();
		c.print_test_C();

		D d = new D();
		d.print_test_A();
		d.print_test_D();

	}
}
