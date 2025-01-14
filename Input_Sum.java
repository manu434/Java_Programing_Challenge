//3 Java Program for intaking two numbers using Scanner and printing their sum
package assigments;
import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter the first number:");
	int num1=scanner.nextInt();
	
	System.out.println("Enter the secnd nuner:");
	int num2=scanner.nextInt();
	scanner.close();
	
	int Sum=num1+num2;
	System.out.println("The sum is: " + Sum);
		
}
}
