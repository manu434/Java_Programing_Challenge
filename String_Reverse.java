//73://Java Program to find Reverse of the string.
package assigments;

public class Practice {
	public static void main(String[] arg) {
		String m1 = "MANU";
		String reversedStr = "";

		// Iterate through the string from last and add each character to variable
		// reversedStr
		for (int i = m1.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + m1.charAt(i);
		}

		System.out.println("Original string: " + m1);
		// Displays the reverse of given string
		System.out.println("Reverse of given string: " + reversedStr);
	}
}