//77:check wheather a string is vowel or not:
package stringMethods;

public class Vowels {

	public static void main(String[] args) {

		String str1 = "manu k shibu";
		System.out.println("vowels in a string:");
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			// Checks whether a character is a vowel
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
					|| str1.charAt(i) == 'u') {
				// Increments the vowel counter
				count++;

			}

		}
		System.out.println("count of vowels: " + count);
	}
}
