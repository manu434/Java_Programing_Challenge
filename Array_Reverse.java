//70://Reverse an array:
package assigments;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int v : a) {
			System.out.print(v);
		}
		System.out.println();

		System.out.println("Reversed Array:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();

		sc.close();
	}
}