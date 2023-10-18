package com.project.example.oops;

class Add{
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {//overloading add method by changing the no of arguments
		return a+b+c;
	}
	static double add(double a, double b, double c) {//overloading add method by changing the data type of arguments
		return a+b+c;
	}
}

public class Overloading {

	public static void main(String[] args) {
		System.out.println(Add.add(1, 10));
		System.out.println(Add.add(2, 20, 30));
		System.out.println(Add.add(2.5, 20.4, 30.0));
	}
}
