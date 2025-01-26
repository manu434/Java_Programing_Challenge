60://String basic program:
package stringMethods;

public class String1 {
	public static void main(String[] args) {
		// length find method1:
		String a = "manu";
		System.out.println(a.length());

		// length find method2:
		String b = "Luminar";
		int y = b.length();
		System.out.println(y);

		// Concatenate the string using method (join the string:)
		String s1 = "hello";
		String s2 = "manu K Shibu";
		System.out.println(s1.concat(" " + s2));

		// Concatenate using Operator:
		String s3 = "hello";
		String s4 = "Rakhi";
		System.out.println(s3 + " " + s4);

		// Execution priority using String and Integer:
		System.out.println(s3 + s4 + 1 + 2);
		System.out.println(1 + 2 + 3 + s3 + s4);

		// Convert to lower and upper case:
		String v = "Luminar Technolab";
		System.out.println(v.toLowerCase());
		System.out.println(v.toUpperCase());

		// Starting and ending finder:
		System.out.println(v.startsWith("l"));
		System.out.println(v.endsWith("b"));

		// Comparing strings:
		String a1 = "manu";
		String a2 = "Manu";
		System.out.println(a1.equals(a2));
		System.out.println(a1.equalsIgnoreCase(a2));

		// Trim a string(white space remove):
		String t = " manu";
		System.out.println(t);
		System.out.println(t.trim());

		// Extract a string:
		String s = "Welcome"; // 0w,1e,2l,3c,4o,5m,6e =(Starting_index) // 1w,2e,3l,4c,5o,6m,7e//
								// =(Ending_index)
		System.out.println(s.substring(4)); // 0,1,2,3 it exclude and extract the remaining part
		System.out.println(s.substring(2, 5)); // 0,1,2 and 1,2,3,4,5 between this it wil extract

		// Include or Contains:
		String x1 = "Luminar Manu";
		System.out.println(x1.contains("Manu"));

		// Replace String with other strings:
		System.out.println(x1.replace("Manu", "Rakhi"));

		// ChatAt()
		String z = "Welcome";
		System.out.println(z.charAt(4));

		// Split();
		String d = "Welcome to Luminar";
		String words[] = d.split(" "); // Splits the string by spaces
		for (String outer : words) {
			System.out.println(outer); // Correct variable and add a space after each word

			// char Spit()
			String j = "hello";
			char w[] = j.toCharArray();
			for (char outer1 : w) {
				System.out.println(outer1);

			}

		}

	}

}
