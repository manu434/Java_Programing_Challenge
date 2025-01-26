//73://Java Program to separate the Individual Characters from a String
package assigments;

public class Practice {
	public static void main(String[] agrs) {

		String s = "CHARATERS";
		char[] a = s.toCharArray();
		// System.out.println(s.toCharArray());
		for (Character v : a) {
			System.out.print(v);
		}
		System.out.println();
	}
}