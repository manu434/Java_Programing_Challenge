package Oops;

public class Default_Construtor {
	int empid;
	int salary;
	String designation;

	public Default_Construtor() {
		empid = 45;
		salary = 50000;
		designation = "Developer";
	}

	public static void main(String[] args) {
		Default_Construtor d = new Default_Construtor();
		System.out.println(d.empid);
		System.out.println(d.salary);
		System.out.println(d.designation);

	}

}
