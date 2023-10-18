package com.project.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Utlity_CollectionExample {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i <= 10; i++)
			alist.add(rand.nextInt(1000));
		System.out.println("Unsorted Array:\t" + alist); // unsorted order

		/****************** Sorting ******************/

		Collections.sort(alist); // Default sorting order
		System.out.println("Sorted Array:\t" + alist);

		Collections.sort(alist, new myComparator()); // Customized shorting order
		System.out.println("Custom Sorting:\t" + alist);

		/****************** Searching ******************/

		System.out.println(Collections.binarySearch(alist, 300)); // -1

		/****************** Reversing ******************/

		Collections.reverse(alist);
		System.out.println("Reverse Order:\t"+alist);

	}
}
