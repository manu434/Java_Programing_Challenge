//63:Q4:factorial of a number:
package stringMethods;

import java.util.Scanner;

public class Assign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int f = 1;
		for (int i = 1; i <= num; i++) {
			f = f * i;

		}
		System.out.println("Factorial of the number is: " + f);
		sc.close();
	}
}
