package com.project.example.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map_MapExample {

	public static void main(String[] args) {
		HashMap hmap = new HashMap<>();
		hmap.put(101, "Rajesh");
		hmap.put(102, null);
		hmap.put(100, "Kumar");
		hmap.put(104, "gupta");
		hmap.put("test", 1003);
		System.out.println("HashMap: "+hmap); 		// {100=Kumar, test=1003, 101=Rajesh, 102=null, 104=gupta}

		System.out.println(hmap.get(100)); 			// Kumar
		System.out.println(hmap.containsKey(1003)); // false
		System.out.println(hmap.entrySet()); 		// [100=Kumar, test=1003, 101=Rajesh, 102=null, 104=gupta]
		System.out.println(hmap.size()); 			// 5

		/* LinkedHashMap is exactly same except Insertion order is preserved */

		LinkedHashMap lmap = new LinkedHashMap<>();
		lmap.put(101, "Rajesh");
		lmap.put(102, null);
		lmap.put(100, "Kumar");
		lmap.put(104, "gupta");
		lmap.put("test", 1003);
		System.out.println("Linked HashMap: "+lmap); // {101=Rajesh, 102=null, 100=Kumar, 104=gupta, test=1003}

		/************************* SortedMap ***********************/

		SortedMap smap = new TreeMap();
		smap.put(101, "Rajesh");
		smap.put(102, null);
		smap.put(100, "Kumar");
		smap.put(104, "gupta");
		//smap.put("test", 1003);//Heterogeneous objects are not allowed. 
		System.out.println("Sorted Map: "+smap);	//{100=Kumar, 101=Rajesh, 102=null, 104=gupta}
		
		/************************* HashTable ***********************/
		
		Hashtable htable=new Hashtable<>();
		
		htable.put(101, "A");
		htable.put(102, "B");
		htable.put(100, "C");
		htable.put(108, "C");
		htable.put("test", 1005);
		System.out.println("HashTable: "+htable);	//{108=C, 102=B, 101=A, 100=C, test=1005}
	}
}
