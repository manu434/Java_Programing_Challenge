//72://Java Program to add two matrices
package assigments;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		int[][] m1 = new int[2][3]; // Matrix 1: 2x3
		int[][] m2 = new int[2][3]; // Matrix 2: 2x3
		Scanner sc = new Scanner(System.in);

		// Input elements for Matrix 1
		System.out.println("Enter the elements of Matrix-1:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				m1[i][j] = sc.nextInt();
			}
		}

		// Input elements for Matrix 2
		System.out.println("Enter the elements of Matrix-2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				m2[i][j] = sc.nextInt();
			}
		}

		// Display Matrix 1
		System.out.println("Array elements in Matrix-1:");
		for (int[] outer : m1) {
			for (int v : outer) {
				System.out.print(v + " ");
			}
			System.out.println();
		}

		// Display Matrix 2
		System.out.println("Array elements in Matrix-2:");
		for (int[] outer1 : m2) {
			for (int v : outer1) {
				System.out.print(v + " ");
			}
			System.out.println();
		}

		// Add the two matrices
		int[][] resultMatrix = new int[2][3]; // Resultant matrix after addition
		for (int i = 0; i < 2; i++) { // Loop through rows
			for (int j = 0; j < 3; j++) { // Loop through columns
				resultMatrix[i][j] = m1[i][j] + m2[i][j]; // Addition logic
			}
		}

		// Display the resultant matrix
		System.out.println("Resultant Matrix after addition:");
		for (int[] row : resultMatrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}