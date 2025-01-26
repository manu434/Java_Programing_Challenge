//69:Sum and avg of array elements:

//Input: Array of integers.
//Output: The maximum and minimum values.
//Calculate the Sum and Average of Array Elements

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
			System.out.println("The array elemets are");
			System.out.println(v + " ");
		}
		int s = 0;
		int avg = 0;
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
			avg = s / a.length;

		}
		System.out.println("The sum of Array elements is: " + s);
		System.out.println("The average of array elements is: " + avg);
		sc.close();
	}

}