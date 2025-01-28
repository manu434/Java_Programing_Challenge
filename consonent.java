//79:check wheather a string is consonent or not:
public class Vowels {
	public static void main(String[] args) {
		String str1 = "manu k shibu";
		System.out.println("Consonants in the string:");

		int count = 0;

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);

			// Check if the character is a consonant
			if (isConsonant(ch)) {
				count++;
				System.out.println(ch + " is a consonant.");
			}
		}

		System.out.println("Total number of consonants: " + count);
	}

	// Method to check if a character is a consonant
	public static boolean isConsonant(char ch) {
		// Check if it's a letter and not a vowel
		return Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
				|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}
}