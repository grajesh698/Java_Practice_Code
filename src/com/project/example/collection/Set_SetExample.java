package com.project.example.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_SetExample {

	public static void main(String[] args) {
		HashSet hset = new HashSet<>();

		hset.add(10);
		hset.add(20);
		hset.add(10);
		hset.add(06);
		hset.add(30);
		hset.add(null);
		hset.add("test"); // Heterogeneous objects are allowed.
		System.out.println(hset); // [null, 20, test, 6, 10, 30] Insertion order not preserve
		// We can use all method used in Set like remove(), clear() etc.

		/*************************** LinkedHashSet **************************/

		LinkedHashSet lhset = new LinkedHashSet<>();
		lhset.add(10);
		lhset.add(20);
		lhset.add(30);
		lhset.add(20);
		lhset.add(12);
		lhset.add(null);
		lhset.add(5);
		lhset.add("test"); // Heterogeneous objects are allowed.
		System.out.println(lhset); // [10, 20, 30, 12, null, 5, test] Insertion order preserve
		// We can use all method used in Set like remove(), clear() etc.

		/************************** SortedSet *******************************/

		SortedSet sortSet = new TreeSet<>();
		sortSet.add(10);
		sortSet.add(20);
		sortSet.add(30);
		sortSet.add(40);
		sortSet.add(20);
		sortSet.add(05);
		// sortSet.add(null); //Can not add Null
		// lhset.add("test"); // Heterogeneous objects are not allowed.
		System.out.println(sortSet); // [5, 10, 20, 30, 40]

		System.out.println(sortSet.first()); // 5
		System.out.println(sortSet.last()); // 40
		System.out.println(sortSet.headSet(30)); // [5, 10, 20]
		System.out.println(sortSet.tailSet(30)); // [30, 40]
		System.out.println(sortSet.subSet(10, 30)); // [10, 20]

		/*************************** TreeSet **************************/

		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		//t.add(101);// Heterogeneous objects are not allowed.
		//t.add(null);//Not allow
		System.out.println(t);
	}
}
