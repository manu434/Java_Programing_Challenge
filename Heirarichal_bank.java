package Oops;

class bank {
	public void withdraw() {
		System.out.println("withdrwa the money:");

	}

	public void deposit() {
		System.out.println("deposit the money:");

	}

}

class Sbi extends bank {
	public void sbiinterest() {
		System.out.println("sbi interest:");

	}

}

class Hdfc extends bank {
	public void loan() {
		System.out.println("loan for you:");

	}
}

public class Heirarical_bank {
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		h.deposit();
		h.loan();
		h.withdraw();
		Sbi s = new Sbi();
		s.deposit();
		s.withdraw();
		s.sbiinterest();

	}

}
