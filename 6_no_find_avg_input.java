//26 Java program which intakes 6 numbers as input and prints their average
package assigments;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("The firt no:");
		int a = scanner.nextInt();

		System.out.println("The second no:");
		int b = scanner.nextInt();

		System.out.println("The Third no:");
		int c = scanner.nextInt();

		System.out.println("The Fourth no:");
		int d = scanner.nextInt();

		System.out.println("The fifth no:");
		int e = scanner.nextInt();

		System.out.println("The Sixth no:");
		int f = scanner.nextInt();

		float avg = a + b + c + d + e + f / 6;

		System.out.println("The avg of 6 numbers is:" + "\n" + avg);
	}

}


