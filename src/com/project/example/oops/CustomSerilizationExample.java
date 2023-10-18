package com.project.example.oops;

import java.io.*;

class Student implements Serializable {
	String username = "cruzz";
	transient String password = "password";

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String encPwd = "123" + password;
		oos.writeObject(encPwd);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String pwd = (String) ois.readObject();
		password = pwd.substring(3);
	}
}

public class CustomSerilizationExample {

	public static void main(String[] args) throws Exception {

		Student s = new Student();

		FileOutputStream fos = new FileOutputStream("C:\\Users\\rajesh.kumar1\\Desktop\\abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);

		FileInputStream fis = new FileInputStream("C:\\Users\\rajesh.kumar1\\Desktop\\abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student std = (Student) ois.readObject();

		System.out.println(std.username + " : " + std.password);

		fis.close();
		fos.close();
	}
}
