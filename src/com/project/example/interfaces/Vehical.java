package com.project.example.interfaces;

public interface Vehical {
	void changeGear(int a);
	void speedUp(int a);
	void applyBreak(int a);
	
	default void displayInterface() {
		System.out.println("Inside the interface block");
	}
}
