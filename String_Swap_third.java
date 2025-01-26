//74://Swap two Strings:
package assigments;

public class Practice {
	public static void main(String[] arg) {
		String str1 = "MANU";
		String str2 = "Shibu";
		System.out.println("Before Swap:" + str1 + " " + str2);

		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("After Swap:" + str1 + " " + str2);

	}
}
