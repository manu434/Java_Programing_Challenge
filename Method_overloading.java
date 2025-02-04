package Oops;

public class Method_Overloading {
	public void add(int a) {
		System.out.println(a);
	}

//1:by changing no of arguments or parameters:
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

//2:by changing data-type of arguments:
	public void add(double a, double b) {
		double c = a / b;
		System.out.println(c);
	}

//3:by changing order of parameters:
	public void add(int a, double b) {
		double c = a * b;
		System.out.println(c);

	}

	public void add(double a, int b) {
		double c = a % b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Method_Overloading m = new Method_Overloading();
		m.add(9);
		m.add(20, 30);
		m.add(2, 3);
		m.add(3, 4.5);
		m.add(2, 3);
	}

}
