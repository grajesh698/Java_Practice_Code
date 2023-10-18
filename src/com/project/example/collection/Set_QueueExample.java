package com.project.example.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyNewComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String I1 = (String) obj1;
		String I2 = obj2.toString();
		return I2.compareTo(I1);
	}
}

public class Set_QueueExample {

	public static void main(String[] args) {
		PriorityQueue que = new PriorityQueue();
		que.offer("A");
		que.offer("Z");
		que.offer("L");
		que.offer("B");
		System.out.println(que);// [A, B, L, Z]
		System.out.println(que.poll());// A
		System.out.println(que);// [B, Z, L]

		/****************** PriorityQueue Comparator ******************/

		PriorityQueue q = new PriorityQueue(15, new MyNewComparator());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");

		System.out.println("Priority: " + q);//[Z, B, L, A]
	}
}