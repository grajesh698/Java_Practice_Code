package com.project.example.collection;

import java.util.Stack;

public class List_StackExample {

	public static void main(String[] args) {
		Stack<Object> stc = new Stack<>();

		stc.add(10);
		stc.add(20);
		stc.add(30);
		stc.add(20);

		System.out.println(stc);// [10, 20, 30, 20]

		stc.push(10);
		stc.push(40);
		stc.push(50);
		System.out.println(stc);// [10, 20, 30, 20, 10, 40, 50]
		System.out.println(stc.empty());// false

		System.out.println(stc.peek());// 50
		System.out.println(stc.search(30));// 5 (return any positive value if present else negative)
		System.out.println(stc.search(130));// -1

		stc.pop();
		System.out.println(stc);// [10, 20, 30, 20, 10, 40]
	}
}
