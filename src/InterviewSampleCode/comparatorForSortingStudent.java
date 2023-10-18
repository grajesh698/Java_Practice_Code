package InterviewSampleCode;

import java.util.*;

public class comparatorForSortingStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		list.add(new Student(1, 29, "Rajesh"));
		list.add(new Student(2, 30, "Rakesh"));
		list.add(new Student(3, 31, "Ramesh"));
		list.add(new Student(4, 27, "Rupesh"));
		list.add(new Student(5, 32, "Dipesh"));

		System.out.println("Before Sorting:\n");
		Iterator<Student> custIterator = list.iterator();
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		Collections.sort(list, new CustomerSortingComparator());
		System.out.println("\nAfter Sorting:\n");

		for (Student s : list) {
			System.out.println(s);
		}
	}
}

class Student {

	int RollNumber, Age;
	String Name;

	public Student(int rollNumber, int age, String name) {
		this.RollNumber = rollNumber;
		this.Age = age;
		this.Name = name;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.RollNumber = rollNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		this.Age = age;
	}

	@Override
	public String toString() {
		return "[RollNumber=" + RollNumber + ", Name=" + Name + ", Age=" + Age + "]";
	}
}

class CustomerSortingComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		int nameCompare = s1.getName().compareTo(s2.getName());
		int ageCompare = s1.getAge().compareTo(s2.getAge());

		return (nameCompare == 0) ? ageCompare : nameCompare;
	}
}