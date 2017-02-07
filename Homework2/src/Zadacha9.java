import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A : ");
		int a = sc.nextInt();
		System.out.println("Enter number B : ");
		int b = sc.nextInt();
		int y = 0;

		for (int i = a; i <= b; i++) {

			if (y > 200) {
				break;
			}
			if (i % 3 == 0) {
				System.out.println("skip 3");
				continue;
			}
			y += i * i;
			if (i == b || y > 200) {
				System.out.println(i * i);

			} else {
				System.out.print(i * i + ", ");
			}

		}
	}

}
