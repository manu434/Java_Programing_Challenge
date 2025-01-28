//81)	creat a class classroom with data members rolno,name,mark it consists if two mwthod store to assign values and display to print details create object and call //these methods?
package Oops;

import java.util.Scanner;

public class Classroom {

	String name;
	int marks;
	int rollno;

	public void store() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the marks:");
		marks = sc.nextInt();
		System.out.println("Enter the rollno:");
		rollno = sc.nextInt();
		sc.close();
	}

		public void Display() {
		System.out.println("The name of Student is: " + name);
		System.out.println("The Marks of students is: " + marks);
		System.out.println("The Roll no of student is: " + rollno);
	}

	public static void main(String[] args) {
		Classroom classr = new Classroom();
		classr.store();
		classr.Display();

	}

}

