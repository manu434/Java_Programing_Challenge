//54:Array with String input and display:
package array;

import java.util.Scanner;

public class Array1d {

	public static void main(String[] args) {
		String[] a = new String[3];
		System.out.println("Enter the names:");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			a[i] = sc.next();
		}
		for (int i = 0; i < 3; i++) {

			System.out.println(a[i]);
		}

	}
}
