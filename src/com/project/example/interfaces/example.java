package com.project.example.interfaces;

public class example implements interfaceTest {
	
	@Override
	public void display() {
		System.out.println("Testing.....!!!");
	}
	
	public static void main(String[] args) {
		
		interfaceTest.displayTest();
		
		example e=new example();
		e.display();
		
		System.out.println(id);
	}

}
