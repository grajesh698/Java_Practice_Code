package com.project.example.collection;

import java.util.ArrayList;

public class List_ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();

		a.add(10);
		a.add(30);
		a.add(20);
		a.add(05);
		a.add(10);
		a.add(25);
		a.add(20);
		a.add(15);
		a.add("Rajesh");// Heterogeneous objects are allowed.

		System.out.println(a);// [10, 30, 20, 5, 10, 25, 20, 15]

		a.remove(4);// remove 4th index value
		System.out.println(a);// [10, 30, 20, 5, 25, 20, 15]

		a.clear();// remove all
		System.out.println(a);// []

		a.add(10);
		a.add(25);
		a.add(20);
		a.add(15);
		ArrayList<Object> arrlist = new ArrayList<Object>(a);// creating equivalent ArrayList
		System.out.println(arrlist);// [10, 25, 20, 15]

	}
}