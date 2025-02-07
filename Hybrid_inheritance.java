package Oops;

interface Male {
	void methodA();
}

interface Female {
	void methodB();
}

class Berd {
	void Displaybirds() {
		System.out.println("Display the birds sounds:");
	}
}

class Child extends Berd implements Male, Female {

	@Override
	public void methodA() {
		System.out.println("A Method: Male bird sound");
	}

	@Override
	public void methodB() {
		System.out.println("B Method: Female bird sound");
	}
}

public class Hybrid_inheritance {
	public static void main(String[] args) {
		Child c = new Child();
		c.Displaybirds(); // Display bird information
		System.out.println();
		c.methodA(); // Male method
		c.methodB(); // Female method
	}
}
