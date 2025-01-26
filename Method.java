//65:Method programing basic
//Q1 Method basic programming with object creation and method calling:

package Oops;

//create class and declare variables:(Instance variable)
public class Emp {
	String empname;
	int empid;
	String empdesignation;
	int salary;

//create method and do the function here it is to display();	
	public void display() {

		System.out.println(empname);
		System.out.println(empid);
		System.out.println(empdesignation);
		System.out.println(salary);
	}

//create main method for program execution,object creation,variable initialize,method calling:
	public static void main(String[] args) { // java program start here

		Emp emp = new Emp(); // object creation
		emp.empname = "Manu K Shibu"; // variable initialize using object
		emp.empid = 45;
		emp.empdesignation = "Developer";
		emp.salary = 50000;
		emp.display(); /// method call for displaying

	}

}
