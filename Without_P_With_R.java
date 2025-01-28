//85)	package Oops;

// Without parameter and with return type;

//here we are not passing any parameters but we should return it so int datatype should be return datatype and inistialize,result,and return
//create object in main method and call the method 

public class Without_P_With_R {

	public int mul() {

		int a = 10, b = 2;
		int c = a * b;
		return c;

	}

	public static void main(String[] agrs) {
		Without_P_With_R sc = new Without_P_With_R();
		System.out.println(sc.mul());

	}
}

