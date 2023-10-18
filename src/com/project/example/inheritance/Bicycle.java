package com.project.example.inheritance;

public class Bicycle {
	public int speed;
	public int gear;

	public Bicycle(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}

	public void applyBreak(int dec) {
		speed -= dec;
	}

	public void speedUp(int inc) {
		speed += inc;
	}

	public String toString() {
		return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
	}
}
