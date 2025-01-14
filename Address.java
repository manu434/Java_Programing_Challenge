//6 Take input as string a person full adrresss and display it
package assigments;
import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter the name :Address :Place :Pin_code");
    String name=scanner.nextLine();
    String address=scanner.nextLine();
    String place=scanner.nextLine();
    int pincode=scanner.nextInt();
    
    System.out.println("The Complete address of person is:" + "\n+"+ name  + "\n"+address + "\n"+ place + "\n"+ pincode);
    
	scanner.close();
	
}
}
