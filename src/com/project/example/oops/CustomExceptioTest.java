package com.project.example.oops;

class CustomException extends Exception {
	public CustomException(String str) {
		super(str);
	}
}

public class CustomExceptioTest {
	public static void Divide(int x, int y) throws CustomException {
		if(y<=0) {
			throw new CustomException("Can not divide by zero!!!");
		}
		int z = x / y;
		System.out.println("Z = "+z);
	}

	public static void main(String[] args){
		try {
			Divide(10, 0);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}