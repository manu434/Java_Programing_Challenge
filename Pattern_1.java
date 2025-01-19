//35://Q1: ***
//////*** pattern print

package control_statements;

public class Nested_loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}