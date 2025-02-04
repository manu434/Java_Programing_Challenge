package Oops;

public class Method_Access1 {
	protected void unique() {
		System.out.println("Print the uniqueness in Method Access_1");

	}

	public static void main(String[] args) {

	}

}

package stringMethods;

import Oops.Method_Access1;

public class Method_Access_2 extends Method_Access1 {

	public static void main(String[] args) {
//method access:
		Method_Access_2 m = new Method_Access_2();
		m.unique();
	}

}
