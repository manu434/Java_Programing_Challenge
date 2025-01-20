//45: Palindrome check:
package control_statements;

public class palindrome {
	public static void main(String[] args) {
		int number = 161;
		int reverse = 0;
		int palin = number;

		System.out.println("Original Number: " + number);

		while (number != 0) {
			int digit = number % 10; // Extract the last digit
			reverse = reverse * 10 + digit; // Append the digit
			number = number / 10; // Remove the last digit
		}

		if (palin == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
