//18 pgm to find quotient and remainder:

package assigments;
import java.util.Scanner;
public class Practice {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number");
	 int num1=scanner.nextInt();

	 System.out.println("The Divisor:");
	 int divi=scanner.nextInt();
	
	 System.out.println("The quotiesnt is:" + num1/divi);
	 System.out.println("The Divisor is:" + num1%divi);
	 		 
}
}

