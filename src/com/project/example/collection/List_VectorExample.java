package com.project.example.collection;

import java.util.Vector;

public class List_VectorExample {

	public static void main(String[] args) {
		Vector<Object> vec =new Vector<>();
		
		vec.add(10);
		vec.add(20);
		vec.add(0, null);
		vec.add(30);
		vec.add(10);
		vec.add(20);
		vec.add(1, null);
		vec.add(30);
		vec.add(20);
		vec.add("test");//Heterogeneous objects are allowed.
		
		System.out.println(vec);//[null, null, 10, 20, 30, 10, 20, 30, 20, test]
		System.out.println(vec.size());//10
		System.out.println(vec.capacity());//10
		
		//vec.remove(1);//[null, 10, 20, 30, 10, 20, 30, 20, test]
		vec.removeElementAt(3);//[null, null, 10, 30, 10, 20, 30, 20, test]
		vec.clear();//[]
		System.out.println(vec);
		
	}

}
