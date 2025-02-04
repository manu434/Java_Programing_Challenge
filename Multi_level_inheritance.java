package Oops;

class Dog2 {
	public void barking() {
		System.out.println("The Dog is barking:");

	}
}

class Cat1 extends Dog2 {
	public void eating() {
		System.out.println("The cat is eating:");

	}
}

class Birds extends Cat1 {
	public void flying() {
		System.out.println("the birds are flying:");

	}
}

public class Multi_level_inheritance {
	public static void main(String[] args) {
		Cat1 c = new Cat1();
		c.barking();
		c.eating();
		Birds b = new Birds();
		b.barking();
		b.eating();
		b.flying();

	}

}
