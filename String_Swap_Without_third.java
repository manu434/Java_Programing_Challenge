//75://Swap two Strings without third variable:
//String swap without third var:
package assigments;

public class Practice {
	public static void main(String[] arg) {
		String str1 = "MANU";
		String str2 = "Shibu";
		System.out.println("Before Swap:" + str1 + " " + str2);

		// withput using 3rd variable:
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		//System.out.println(str1);

		System.out.println("After Swap:" + str1 + " " + str2);

	}
}