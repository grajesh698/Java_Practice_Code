package com.project.example.collection;

import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		return ((I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
	}
}

public class ComparableANDconmprator {
	public static void main(String[] args) {
		/****************** Comparable ******************/
		TreeSet<Integer> tset = new TreeSet<Integer>();// Default natural sorting order[Ascending Order]
		for (int i = 0; i < 10; i++)
			tset.add(i);
		System.out.println(tset);

		/****************** Comparator ******************/

		TreeSet<Integer> cset = new TreeSet<Integer>(new myComparator());// Customized sorting order[Descending Order]
		for (int i = 0; i < 10; i++)
			cset.add(i);
		System.out.println(cset);
	}
}
