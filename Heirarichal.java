package Oops;

class Dog1 {
	public void barking() {
		System.out.println("The dog is barking:");
	}
}

class Catt extends Dog1 {
	public void eating() {
		System.out.println("Cat is eating:");
	}
}

class Bird extends Dog1 {
	public void flying() {
		System.out.println("Birds are fying:");
	}
}

public class Heirarichal {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.barking();
		b.flying();
		Catt c = new Catt();
		c.barking();
		c.eating();

	}

}
