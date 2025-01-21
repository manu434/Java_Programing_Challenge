//47: Fibanocci series:
package assigments;

public class Practice {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int c = 10;
		int n3;
		System.out.print(n1 + " " + n2);
		for (int i = 0; i < c; ++i) {
			n3 = n2 + n1;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}