package com.project.example.multithreading;

public class ThreadExtends extends Thread {
	public void run() {
		try {
			System.out.println("Thread id " + Thread.currentThread().getId() + " is Running");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadExtends t = new ThreadExtends();
		t.start();
	}
}
