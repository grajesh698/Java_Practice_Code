package com.project.example.interfaces;

public class Bicycle implements Vehical{
	
	int speed, gear;

	@Override
	public void changeGear(int newGear) {
		gear=newGear;
	}

	@Override
	public void speedUp(int increment) {
		speed+=increment;
	}

	@Override
	public void applyBreak(int decrement) {
		speed-=decrement;
	}
	
	public void display() {
		System.out.println("Bicycle is running with the Speed of "+speed +"kmph in Gear "+gear+".");
	}
	
	public static void main(String[] args) {
		Bicycle b=new Bicycle();
		b.changeGear(2);
		b.speedUp(50);
		b.applyBreak(30);
		
		System.out.println("Bicycle present state...");
		b.display();
	}

}
