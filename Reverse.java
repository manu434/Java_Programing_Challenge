//44:Reverse of a number:
package control_statements;

public class Reverse {
	public static void main(String[] args) {
		int number = 12345;
		int reverse = 0;

		System.out.println("Original Number: " + number);

		while (number != 0) {
			int digit = number % 10; // Extract the last digit
			reverse = reverse * 10 + digit; // Append the digit
			number = number / 10; // Remove the last digit
		}

		System.out.println("Reversed Number: " + reverse);
	}
}