//71://Input: Two arrays.
//Output: Merged array.
package assigments;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		int[] a1 = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First array elements:");
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}

		int[] a2 = new int[2];
		System.out.println("Enter the second array elements:");
		for (int i = 0; i < a2.length; i++) {
			a2[i] = sc.nextInt();
		}

		int index = 0;
		int[] ma = new int[a1.length + a2.length];
		for (int v : a1) {
			ma[index++] = v;
		}
		for (int v : a2) {
			ma[index++] = v;
		}

		System.out.println("Merged Array:");
		for (int v : ma) {
			System.out.print(v + " ");
		}

		sc.close();
	}
}
