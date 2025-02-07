package Oops;

public class Variable {

	// Instance variable (non-static)
	int instanceVar = 50;

	// Static variable
	static int staticVar = 100;

	// Final variable (constant)
	final int finalVar = 200;

	// Method that demonstrates the use of different variables
	public void displayValues() {
		// Local variable inside the method
		int localVar = 300;

		// Printing the values of all variables
		System.out.println("Instance variable: " + instanceVar);
		System.out.println("Static variable: " + staticVar);
		System.out.println("Final variable: " + finalVar);
		System.out.println("Local variable: " + localVar);
	}

	public static void main(String[] args) {
		// Creating an object to access instance variables
		Variable obj = new Variable();

		// Calling the method that uses local, instance, static, and final variables
		obj.displayValues();

		// Modifying static and instance variables
		obj.instanceVar = 60;
		staticVar = 150;

		System.out.println("\nAfter modification:");
		obj.displayValues();

		// Uncommenting the line below will cause an error
		// obj.finalVar = 250; // Cannot modify final variable
	}
}
