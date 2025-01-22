//59:Print the array elemets is odd or even:
package assigments;

public class Practice {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);

			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " The number in array is even");
			} else {
				System.out.println(a[i] + "  The number in array is odd");
			}
		}

	}
}

