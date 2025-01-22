//57://Q1 Declare and print using 2D array:
package array;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int[][] a = new int[4][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();

			}
		}
		System.out.println("The elements are:");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
		sc.close();
	}
}