package Oops;

class Encapsulation {
	private String name;
	private String designation;

	// getters and setters:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

public class Encap {
	public static void main(String[] agrs) {
		Encapsulation e = new Encapsulation();
		e.setName("Manu:");
		e.setDesignation("Developer:");
		System.out.println(e.getName());
		System.out.println(e.getDesignation());
	}

}
