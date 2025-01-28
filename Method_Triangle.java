//90)	package Oops;

//with parameter and without return type:
public class Triangle {
	public void area(int a, int b) {
		float z = (float) (0.5 * a * b);
		System.out.println(z);

	}

	public static void main(String[] args) {
		Triangle sc = new Triangle();
		sc.area(3, 2);

	}

}

