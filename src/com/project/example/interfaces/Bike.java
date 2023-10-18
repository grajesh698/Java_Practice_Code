package com.project.example.interfaces;

public class Bike implements Vehical{
	
	int speed, gear;

	@Override
	public void changeGear(int newGear) {
		gear=newGear;
	}

	@Override
	public void speedUp(int inc) {
		speed+=inc;
	}

	@Override
	public void applyBreak(int dec) {
		speed-=dec;
	}
	
	public void display(){
		System.out.println("Bike is running with the Speed of "+speed +"kmph in Gear "+gear+".");
	}
	
	public static void main(String[] args) {
		Bike b=new Bike();
		b.changeGear(3);
		b.speedUp(100);
		b.applyBreak(50);
		
		System.out.println("Bike present state..........");
		b.display();
	}

}
