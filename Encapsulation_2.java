package Oops;

class Accout {
	private int accnumber;
	private String name;
	private String email;
	private int amount;

	public int getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}

public class Account_encapsulation {
	public static void main(String[] args) {
		Accout a = new Accout();
		// setting values:
		a.setAccnumber(123456789);
		a.setName("Manu");
		a.setAmount(40000);
		a.setEmail("manukshibu@gamil.com");
		// get values:
		System.out.println("Account number: " + a.getAccnumber());
		System.out.println("Account holder name: " + a.getName());
		System.out.println("Amount in Account: " + a.getAmount());
		System.out.println("Mail-id of Account holder: " + a.getEmail());
	}

}
