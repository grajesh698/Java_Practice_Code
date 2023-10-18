package com.project.example.oops;

public class Array {
	
	static void mininum(int[] arr) {
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Mininum number is : "+min);
	}
	
	static void multiDimArray() {
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			System.out.print("[");
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println("]");
		}
	}
	
	public static void main(String[] args) {
		int a[]= {10,5,3,7,9,2};
		mininum(a);
		System.out.println("-------------------");
		multiDimArray();
	}
}
