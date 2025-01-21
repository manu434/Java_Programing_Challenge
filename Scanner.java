//48: Scanner check and create
package basics;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age:");
		int age = sc.nextInt();
		System.out.println("Enter the name:");
		String name = sc.next();
		System.out.println("Enter the character:");
		char c = sc.next().charAt(0);
		System.out.println(age);
		System.out.println(name);
		System.out.println(c);
		sc.close();
	}

}

