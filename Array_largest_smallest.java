//68://Input: Read n elements.Output: Display the elements.
//Find the Largest and Smallest Element in an Array
package assigments;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input the size of the array
		System.out.print("Enter how many numbers you want to input: ");
		int n = sc.nextInt();

		// Create an array to store the elements
		int[] numbers = new int[n];

		// Input the elements of the array
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		// Display the array elements
		System.out.println("You entered:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Find the largest and smallest elements
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < n; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		// Display the largest and smallest elements
		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);

		sc.close(); // Close the scanner
	}
}
