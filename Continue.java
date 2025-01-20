//42: Continue Program:
package control_statements;

public class Continue {
	public static void main(String[] args) {
		for (int j = 0; j <= 7; j++) {
			if (j == 5) {
				continue;
			}
			System.out.println(j);
		}
	}
}
