//53: Array pgmArray question1 using Read and Display method using for_loop:
package array;

import java.util.Scanner;

public class Array1d {
	public static void main(String[] args) {

		int[] a = new int[5];
		System.out.println("Enter the elements:");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("The no of elements in array is:");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);

			sc.close();
		}
	}
}
