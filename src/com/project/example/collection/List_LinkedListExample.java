package com.project.example.collection;

import java.util.LinkedList;

public class List_LinkedListExample {
	public static void main(String[] args) {
		LinkedList linledlist=new LinkedList();
		
		linledlist.add(10);
		linledlist.add(20);
		linledlist.add(30);
		linledlist.add(20);
		linledlist.add(40);
		linledlist.add(15);
		linledlist.add("test");//Heterogeneous objects are allowed.
		
		System.out.println(linledlist);//[10, 20, 30, 20, 40, 15, test]
		
		linledlist.set(2, null);
		System.out.println(linledlist);//[10, 20, null, 20, 40, 15,test]
		
		linledlist.addFirst(00);
		System.out.println(linledlist);//[0, 10, 20, null, 20, 40, 15, test]
		
		linledlist.remove(2);
		System.out.println(linledlist);//[0, 10, null, 20, 40, 15, test]
		
		linledlist.remove();
		System.out.println(linledlist);//[10, null, 20, 40, 15, test]
		
		linledlist.removeLast();
		System.out.println(linledlist);//[10, null, 20, 40, 15]
		
		linledlist.clear();
		System.out.println(linledlist);//[]
	}
}
