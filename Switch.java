
package assigments;

public class Personal {
	public static void main(String[] args) {
		float a = 10;
		float b = 30;
		char operation1 = '+';
		char operation2 = '-';
		char operation3 = '*';
		char operation4 = '/';
		switch (operation1) {
		case '+':
			System.out.println("Addition Value is:" + (a + b));
			break;
		default:
			System.out.println("mks");
		}
		switch (operation2) {
		case '-':
			System.out.println("Subtraction value is:" + (a - b));
			break;
		}
		switch (operation3) {
		case '*':
			System.out.println("Multplication value is:" + (a * b));
			break;
		}
		switch (operation4) {
		case '/':
			System.out.println("Division value is:" + (a / b));
			break;
		}

	}
}