package Oops;

interface Whatucall {
	int a = 10;

	void call();

	void mute();

	void disconnect();

}

class Audiocall implements Whatucall {

	@Override
	public void call() {
		System.out.println("whatup audio call");

	}

	@Override
	public void mute() {
		System.out.println("Whatup mute audio call");

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect audio call");

	}

}

class Videocall implements Whatucall {

	@Override
	public void call() {
		System.out.println("Whatsup video call");

	}

	@Override
	public void mute() {
		System.out.println("mute Video call");

	}

	@Override
	public void disconnect() {
		System.out.println("disconnect video call");

	}

}

public class Interface {
	public static void main(String[] args) {
		// obj creation for audiocall child class:
		Audiocall a = new Audiocall();
		a.call();
		a.disconnect();
		a.mute();
		System.out.println();
		// object creation for videocall child class:
		Videocall v = new Videocall();
		v.call();
		v.disconnect();
		v.mute();
		System.out.println();
		// one-time obj creation for both child class:
		Whatucall sc = new Audiocall();
		sc.call();
		sc.disconnect();
		sc.mute();
		System.out.println();
		sc = new Videocall();
		sc.call();
		sc.disconnect();
		sc.mute();
		System.out.println();
		System.out.println("static and final variable:");
		System.out.println(Whatucall.a);
		// System.out.println(Whatucall.a = 30);

	}

}
