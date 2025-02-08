package Oops;

public class Exception_handling {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			int c = a / b; // This will throw ArithmeticException
			System.out.println(c);
		} catch (ArithmeticException e) { // Catching ArithmeticException specifically
			System.out.println("Exception caught: " + e.getMessage());
		}

		System.out.println("completed:");
	}
}
