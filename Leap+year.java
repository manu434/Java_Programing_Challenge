package assigments;

public class Practice {
	public static void main(String[] args) {
		float year = 2000;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("The year is Leap year");
				} else {
					System.out.println("The year is not a Leap year");
				}

			} else {
				System.out.println("The year is Leap year");
			}
		} else {
			System.out.println("Not a leap year");
		}
	}
}
