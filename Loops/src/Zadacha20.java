
public class Zadacha20 {
	public static void main(String[] args) {

		int c;
		for (int row = 1; row <= 10; row++) {
			c = row;
			c = 0;

			if (row == 10) {
				for (int i = 1; i <= 10; i++) {
					System.out.print(c);
					c++;
				}
				if (c == 10) {
					c = 0;
				}
			}
			System.out.println();

		}
	}
}
