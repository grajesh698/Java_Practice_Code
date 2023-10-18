package com.project.example.multithreading;

public class ThreadImplements implements Runnable {
	public void run() {
		try {
			System.out.println("Thread id " + Thread.currentThread().getId() + " is Running");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadImplements timp = new ThreadImplements();
		Thread thrd = new Thread(timp);
		thrd.start();
	}
}
