//36://Q2: print pattern: *
/////////////////////***
/////////////////////****

package control_statements;

public class Nested_loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
