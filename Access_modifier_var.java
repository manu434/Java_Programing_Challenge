package Oops;

public class Access_Modifier {
	// protected declaration:
	protected int a = 10;

	public static void main(String[] args) {

	}

}

package stringMethods;

import Oops.Access_Modifier;

public class Access_Modifer2 extends Access_Modifier {

	public static void main(String[] args) {
		// variable access:
		Access_Modifer2 sc = new Access_Modifer2();
		System.out.println(sc.a);

	}

}
]