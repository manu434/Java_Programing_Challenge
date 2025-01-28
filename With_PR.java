//84)	package Oops;
// With parameter and with return type:

//here we are using with parameter and with Return type
//method name consists output in which data type and parameters inside the method function call
//mandatory we should return the result here.
//main method we should assign the values through sysout

public class With_PR {

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public static void main(String[] args) {
		With_PR sc = new With_PR();
		System.out.println(sc.sub(40, 30));

	}

}

