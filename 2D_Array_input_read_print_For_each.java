//58://Q2: using for Each in the printing part:

package array;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {

		// declare array:
		int[][] a = new int[4][2];

		// read:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		// display:
		for (int[] outer : a) {
			for (int v : outer) {
				System.out.print(v + " ");

			}
			System.out.println();

		}
		sc.close();
	}

}