//4 Java program to check whether the given input number is even or odd

package assigments;
import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num1=scanner.nextInt();
	
	if(num1 %2 == 0){
		System.out.println(num1+ "The number is Even:");
	}else {
			System.out.println(num1+ "The number is odd:");
			}
		scanner.close();
}
}

