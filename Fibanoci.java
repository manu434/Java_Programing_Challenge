//64:Q4:fibanoci of a number:
package basics;

import java.util.Scanner;

public class Fibanoci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();

		int n1 = 0, n2 = 1;

		System.out.println("Fibonacci series:");
		for (int i = 0; i < n; i++) {
			System.out.print(n1 + " "); // Print the current term
			int next = n1 + n2; // Calculate the next term
			n1 = n2; // Update n1
			n2 = next; // Update n2
		}

		sc.close();
	}
}
