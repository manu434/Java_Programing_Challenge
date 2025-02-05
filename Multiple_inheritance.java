package Oops;

interface bank1 {
	void account();

	void deposit();
}

interface bank2 {
	void income();

	void branch();
}

class Icici implements bank1, bank2 {

	@Override
	public void income() {
		System.out.println("The income of person:");

	}

	@Override
	public void branch() {
		System.out.println("The branch of person :");

	}

	@Override
	public void account() {
		System.out.println("The accout of person:");

	}

	@Override
	public void deposit() {
		System.out.println("The deposit of person:");

	}

}

public class Mutliple_inheritance {
	public static void main(String[] args) {
		Icici i = new Icici();
		i.account();
		i.branch();
		i.deposit();
		i.income();
		System.out.println();
		bank1 b1 = new Icici();
		b1.account();
		b1.deposit();

	}

}
