//49:Input values calculator:
package basics;

import java.util.Scanner;

public class Input_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		double num1 = sc.nextDouble();
		System.out.println("Enter the operator: + , - , * , / ");
		char oper1 = sc.next().charAt(0);
		System.out.println("Enter the second number");
		double num2 = sc.nextDouble();

		switch (oper1) {
		case '+':
			System.out.println("The Result is:" + (num1 + num2));
			break;
		case '-':
			System.out.println("The Result is:" + (num1 - num2));
			break;
		case '*':
			System.out.println("The Result is:" + (num1 * num2));
			break;
		case '/':
			System.out.println("The Result is:" + (num1 / num2));
			break;
		default:
			System.out.println("invalid entry:");
			sc.close();
		}
	}
}