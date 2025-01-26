//76://check the input number is prime or not:
package basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is prime or not:");
		int n = sc.nextInt();

		if (n <= 1) {
			System.out.println("Not a prime number.");

		}

		int count = 0;
		for (int i = 1; i <= n; i++) { // Loop should run from 1 to n
			if (n % i == 0) {
				count++; // Increment count for each divisor
			}
		}

		// Check if the number has exactly two divisors (1 and itself)
		if (count == 2) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}
		sc.close();
	}

}
