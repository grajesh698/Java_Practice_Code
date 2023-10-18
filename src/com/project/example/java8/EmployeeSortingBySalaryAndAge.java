package com.project.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private String department;
}

public class EmployeeSortingBySalaryAndAge {

	public static void main(String[] args) {
		Employee[] emp = { 
				new Employee("Rajesh", "Kalwaar", 75000, "Backend"), 
				new Employee("Rajesh", "Kaaumar", 80000, "Backend"), 
				new Employee("Rohit", "Singh", 85000, "Frontend"),
				new Employee("Vishal", "Kumar", 75000, "Testing"), 
				new Employee("Rajeev", "Ranjan", 95000, "Analysis") 
			};
			// Creating list of Employee
			List<Employee> list = Arrays.asList(emp);

			System.out.println("Employee list Before Sorting\n");
			list.stream().forEach(s -> System.out.println(s));
			System.out.println("------------------------------------------------------------------------------------");

			// First Approach using Instance Method Reference
			List<Employee> eList = list.stream().sorted(Comparator.comparing(Employee::getFirstName))
					.collect(Collectors.toList());

			System.out.println("Employee list After Sorting by First name\n");
			eList.stream().forEach(s -> System.out.println(s));
			System.out.println("------------------------------------------------------------------------------------");

			// Second Approach using Lambda Function
			list.sort((Employee e1, Employee e2) -> e1.getFirstName().compareTo(e2.getFirstName()));

			System.out.println("Employee list After Sorting by First name\n");
			list.forEach(s -> System.out.println(s));
			System.out.println("------------------------------------------------------------------------------------");

			// Sorting by First name and Salary
			Comparator<Employee> sortByName = (e1, e2) -> e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
			Comparator<Employee> sortBySalary = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());

			List<Employee> eList2 = list.stream().sorted(sortByName.thenComparing(sortBySalary))
					.collect(Collectors.toList());

			System.out.println("Employee list After Sorting by First name and Salary\n");
			eList2.stream().forEach(s -> System.out.println(s));
			System.out.println("------------------------------------------------------------------------------------");
		}
}