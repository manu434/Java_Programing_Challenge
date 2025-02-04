package Oops;

public class Parameterized_Constructor {
	int empid;
	int salary;
	String designation;

//	public Parameterized_Constructor(int empid, int salary, String designation) {
//		this.empid = empid;
//		this.salary = salary;
//		this.designation = designation;
//
//	}
	// without this:
	public Parameterized_Constructor(int emp, int sal, String des) {
		empid = emp;
		salary = sal;
		designation = des;

	}

	public void dis() {
		System.out.println("Employee ID: " + empid);
		System.out.println("Salary: " + salary);
		System.out.println("Designation: " + designation);
	}

	public static void main(String[] args) {
		Parameterized_Constructor p = new Parameterized_Constructor(15, 500000, "Developer");
		p.dis();
	}

}
