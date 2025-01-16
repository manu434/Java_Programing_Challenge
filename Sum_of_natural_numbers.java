//32  sum of natural numbers 1 to 100:

package control_statements;

public class For_loop {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
	}

}