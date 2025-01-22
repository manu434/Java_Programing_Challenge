//55:Array with For_each loop:
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
		for (String v : a) {

			System.out.println(v);
		}

	}
}