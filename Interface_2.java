package Oops;

interface basicanimal {
	void eat();

	void sleep();

}

class Monkey {
	public void jump() {
		System.out.println("The monkey will jump");
	}

	public void Bite() {
		System.out.println("The monkey will bite:");
	}
}

class Human extends Monkey implements basicanimal {
	public void speak() {
		System.out.println("Human is speak:");
	}

	@Override
	public void eat() {
		System.out.println("human is eating:");

	}

	@Override
	public void sleep() {
		System.out.println("human is sleeping:");

	}
}

public class Assign_2 {
	public static void main(String[] args) {
		Human h = new Human();
		h.Bite();
		h.jump();
		System.out.println();
		h.eat();
		h.sleep();
		h.speak();

	}

}
