//37:Q3: print pattern:  1
////////////////////  1 2
///////////////////// 1 2 3
///////////////////// 1 2 3 4

package control_statements;

public class Nested_loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}
