package Oops;

class Members {

	String name;
	int age;
	String address;
	int salary;

	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(salary);
	}

}

class Worker extends Members {
	String Specilization;
}

class Manager extends Members {

	String Department;
}

public class Assign {
	public static void main(String[] args) {
		Worker w = new Worker();
		System.out.println("Worker Details:");
		w.address = "kottayam";
		w.age = 20;
		w.name = "manu";
		w.salary = 200000;
		w.Specilization = "MBA";
		System.out.println("Specialization: " + w.Specilization);
		w.display();

		System.out.println();

		Manager m = new Manager();
		System.out.println("Manager details:");
		m.address = "erumely";
		m.age = 20;
		m.name = "shibu";
		m.salary = 20000;
		m.Department = "IT";
		System.out.println("Department: " + m.Department);
		m.display();

	}

}
