/* Swapping numbers
package basics;

public class Swap {
public static void main(String[] args)
{
	int a=10;
	int b=20;
	System.out.println("Numbers before swapping:" +"\n"+ a + "\n"+b);
	//swapping with 2 variables
	a=a+b; //10+20=30
	b=a-b; //30-20=10
	a=a-b; //30-10=20
	System.out.println("Numbers afrer swapping:" +"\n"+ a +"\n"+ b);
	
	//Swapping with 3rd variable
	int c=100;
	int d=20;
	System.out.println("Numbers before swapping:" +"\n"+ c+"\n"+d);
	
	int z=c; //z=100
	c=d;     //c=20
	d=z;    //d=100
	System.out.println("Numbers after swapping:" + "\n"+ c+ "\n"+ d);
}
}

