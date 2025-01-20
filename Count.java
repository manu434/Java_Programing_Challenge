//43: Count of the Number:
package control_statements;

public class Count {
	public static void main(String[] args) {
		int n = 1234;
		int count = 0;
		while (n > 0) {
			n = n / 10;
			System.out.println(n);
			count++;
			System.out.println(count);
		}
		System.out.println(count);

	}
}