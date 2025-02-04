//package Oops;
//
//class A {
//	public void m1() { // same method/signature
//		int a = 10;
//		System.out.println(a);
//
//	}
//}
//
////child class method override the parent class
//class B extends A {
//	public void m1() { // same method
//		int a = 20;
//		System.out.println(a);
//
//	}
//}
//
//public class Method_Overiding {
//	public static void main(String[] args) {
//		B b = new B();
//		b.m1();
//
//	}
//
//}

//package Oops;
//
//class Parent {
//	String name = "manu";
//
//	public void phone() {
//		System.out.println("nokia");
//
//	}
//}
//
////if we want parent class details we need to use super keyword:
class Child extends Parent {
	public void phone() {
		System.out.println("iphone:");
		System.out.println(super.name);
		super.phone();

	}

}

public class Method_Overiding {
	public static void main(String[] args) {
		Child c = new Child();
		c.phone();

	}
}

package Oops;

class car {
	public void speed() {
		System.out.println("car speed:");

	}

	public void power() {
		System.out.println("car power:");

	}
}

//use overriding through GUI method:
//class Bmw extends car {
//
//	@Override
//	public void speed() {
//		System.out.println("bmw speed");
//		super.speed();
//	}
//
//	@Override
//	public void power() {
//		System.out.println("Bmw power");
//		super.power();
//	}
//
//}
//
//public class Method_Overiding {
//	public static void main(String[] args) {
//		Bmw b = new Bmw();
//		b.speed();
//		b.power();
//	}
//}
