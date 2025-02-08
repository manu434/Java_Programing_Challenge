package Oops;

//runtime exception:(unchecked)
public class Exception {
	public static void main(String[] args) {

		// Arithmetic:
		int a = 10, b = 0;
		int c = a / b;
		System.out.println(c);
		System.out.println("Stoped");

		// null pointer
		// String name = null;
		// System.out.println(name.length());

		// array index out of bound:
		int[] z = new int[4];
		System.out.println(z[5]);

	}

}
