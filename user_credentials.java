/*11. Simple Login System
Write a program to check a user's credentials. The user must input a username and password. The program should validate them as follows:

If the username is "admin" and the password is "12345", print "Login successful".
Otherwise, print "Invalid credentials".
Hint: Use if-else for validation.*/

package assigments;
public class Practice {
public static void main(String[] args) {

	String username ="admin";
	int password=12345;
	
	if (username=="admin" && password==12345)
	{
		System.out.println("Login successfull");
	}
	else
	{
		System.out.println("Invalid credentials");
	}
 }
}

