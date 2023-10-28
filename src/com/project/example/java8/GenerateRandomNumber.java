package com.project.example.java8;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// Method 1: with random length and can be +ve or -ve integer generated
		Random random = new Random();
		int num = random.nextInt();
		System.out.println("Method 1: " + num);

		// Method 2: using forEach
		System.out.print("Method 2: ");
		random.ints()
			  .limit(5)
			  .forEach(s -> System.out.print(s + " "));
		System.out.println();

		// Method 3: print random number with length 4
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			int n = random.nextInt(9);
			sb.append(n);
		}
		System.out.println("Method 3: " + sb);
	}
}
