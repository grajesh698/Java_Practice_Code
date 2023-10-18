package com.project.example.multithreading;

public class ThreadSleep extends Thread{

	public static void main(String[] args){
		Thread thrd = new Thread("FirstThread");
		long watingTime = 10000;
		System.out.println("Thread " + thrd.getName() + "is Running...");
		thrd.start();
		System.out.println("Thread is sleeping for " + watingTime + "ms");
		try {
			Thread.sleep(watingTime);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread " + thrd.getName() + "is Terminited...");
	}
}
