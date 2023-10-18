package com.project.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			arr.add(i);
		System.out.println(arr);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		Iterator<Integer> itr = arr.iterator();// Heterogeneous objects are not allowed.
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I % 2 == 0)
				System.out.print(I + " ");// 0 2 4 6 8
			else
				itr.remove();
		}
		System.out.println();
		System.out.println(arr);// [0, 2, 4, 6, 8]

		/********************* ListIterator ************************/
		LinkedList<String> l = new LinkedList<String>();
		l.add("Rajesh");
		l.add("Kumar");
		l.add("Gupta");
		l.add("Bihiya");
		System.out.println(l); //[Rajesh, Kumar, Gupta, Bihiya]
		ListIterator<String> listitr = l.listIterator();
		while (listitr.hasNext()) {
			String s = (String) listitr.next();
			if (s.equals("Gupta"))
				listitr.remove();
			else if (s.equals("Kumar"))
				listitr.add("Kalwar");
			else if (s.equals("Bihiya"))
				listitr.set("Bangalore");
		}
		System.out.println(l);//[Rajesh, Kumar, Kalwar, Bangalore]
	}
}
