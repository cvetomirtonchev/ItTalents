import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Print(num1, num2);

	}

	public static void Print(int start, int end) {
		if (start < end) {
			if (end == 0) {
				return ;
			}
			Print(start, end - 1);

			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");

			}
			System.out.println();

		}
		if (end < start) {
			if (start == 0) {
				return;
			}
			Print(start - 1, end);

			for (int i = end; i <= start; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
