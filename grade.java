//10. Determine the Grade Based on Marks
/*Write a program that takes a student's marks as input and displays the corresponding grade:

Marks ≥ 90: Grade A
Marks ≥ 80 and < 90: Grade B
Marks ≥ 70 and < 80: Grade C
Marks ≥ 60 and < 70: Grade D
Marks < 60: Fail*/

package assigments;
public class Practice {
public static void main(String[] args) {

	int marks =59;
	if (marks>=90)
	{
		System.out.println("A grade");
		
	}
	else if(marks>=80 && marks<90)
	{
		System.out.println("B grade");
		
	}
	else if(marks>=70 && marks<80)
	{
		System.out.println("C grade");
		
	}
	else if(marks>=60 && marks<70)
	{
		System.out.println("D grade");
		
	}
	else
	{
		System.out.println("Fails");
	}
 }
}
