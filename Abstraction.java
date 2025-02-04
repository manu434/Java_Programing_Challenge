package Oops;

//use abstract keyword:
abstract class Google {
	abstract void search();

	public void message() {
		System.out.println("google search:");

	}
}

//use child class to extends parent property and add un-implemented methods:
class Searchall extends Google {

	@Override
	void search() {
		System.out.println("searchall:");

	}

}

class Searchimage extends Google {

	@Override
	void search() {
		System.out.println("Serach image:");

	}

}

class Searchvideos extends Google {

	@Override
	void search() {
		System.out.println("Search videos:");

	}

}

public class Abstraction {
	public static void main(String[] args) {
		// create object for child class and call:
		Searchall a = new Searchall();
		a.search();
		a.message();
		System.out.println();
		Searchimage i = new Searchimage();
		i.search();
		i.message();
		System.out.println();
		Searchvideos v = new Searchvideos();
		v.search();
		v.message();
	}

}
