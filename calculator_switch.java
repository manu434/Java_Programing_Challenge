//22 calculator with Switch statements
package control_statements;

public class Calculator_Switch {
	public static void main(String[] args) {
		float a = 10;
		float b = 30;
		char operation1 = '+';

		switch (operation1) {
		case '+':
			System.out.println("Addition Value is:" + (a + b));
			break;
		case '-':
			System.out.println("Sutraction value is:" + (a - b));
			break;
		case '*':
			System.out.println("Multiplication value is:" + (a * b));
			break;

		case '/':
			System.out.println("Division value is:" + (a / b));
			break;
		default:
			System.out.println("invalid entery");
		}

	}
}

