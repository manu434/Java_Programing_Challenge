//7 Java program which prints the multiplication table of the given input number
package assigments;
import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number for printing the multiplication number:");
	int number = scanner.nextInt();
	System.out.println("The Multiplication of the number is:" + number);
	
	for(int i=1;i<=10;i++) {
		System.out.println(number+"x"+i+"="+(number*i));
		
	}
	scanner.close();
 }
}
