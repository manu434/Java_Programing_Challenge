package control_statements;

public class Nested_if {
	public static void main(String[] args) {
		int age = 1;
		int weight = 50;
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible:");
			} else {
				System.out.println("You are Underweight:");
			}
		} else {
			System.out.println("You are ineligible:");
		}
	}
}
