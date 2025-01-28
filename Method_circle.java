//88)	package Oops;

//Without parameter and without return type:
public class Circle {
	public void area() {
		int r = 5;
		float z = (float) (Math.PI * r * r);
		System.out.println(z);
	}

	public static void main(String[] args) {
		Circle sc = new Circle();
		sc.area();

	}

}

