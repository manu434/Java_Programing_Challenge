//52:Array pgm3: Print using any Loop: instead of so many System.out.println:
package array;

public class Array1d {
	public static void main(String[] args) {

		int[] a = { 11, 12, 40, 55 };// if we know the values;
		int index = 0;
		while (index < a.length) {
			System.out.println(a[index]);
			index++;
		}

	}
}