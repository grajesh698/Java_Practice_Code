package com.project.example.multithreading;

import java.io.IOException;

public class RuntimeExample extends Thread {
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("notepad");//will open a new notepad 
		//Runtime.getRuntime().exec("shutdown -r -t 0");  //restart system
	}
}
