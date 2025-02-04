package Oops;

class Dog {
	public void barking() {
		System.out.println("Do is barking:");
	}
}

class Cat extends Dog {
	public void eating() {
		System.out.println("The cat is eating:");

	}
}

public class Single_Inheritance {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eating();
		c.barking();

	}
}
