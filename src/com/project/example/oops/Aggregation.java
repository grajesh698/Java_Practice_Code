package com.project.example.oops;

class Address {
	String city, state, zip;

	public Address(String city, String state, String zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
}

class Employee {
	int id;
	String name;
	Address add;

	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public void display() {
		String address = add.city + "," + add.state + "-" + add.zip;
		System.out.println("EmpId=" + id + ", Name=" + name + ", Address=" + address);
	}
}

public class Aggregation {
	public static void main(String[] args) {
		Address a = new Address("Bangalore", "Karnataka", "560087");
		Employee e = new Employee(10001, "Rajesh Kumar", a);
		e.display();
	}
}
