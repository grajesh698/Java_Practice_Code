package com.project.example.multithreading;

public class ThreadJoin extends Thread {
	public void run() {
		for (int j = 0; j < 5; j++) {
			try {
				Thread.sleep(3000);
				System.out.println("Current Thread: "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(j + " ");
		}
	}

	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		t1.start();
		try {
			System.out.println("T1 Current Thread: "+Thread.currentThread().getName());
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			System.out.println("T2 Current Thread: "+Thread.currentThread().getName());
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ThreadJoin t3 = new ThreadJoin();
		ThreadJoin t4 = new ThreadJoin();
		t3.start();
		t4.start();
	}
}
