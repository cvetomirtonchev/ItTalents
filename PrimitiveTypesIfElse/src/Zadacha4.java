import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		int a, b;
		System.out.println("A:");
		a = sh.nextInt();
		System.out.println("B:");
		b = sh.nextInt();
		if (a < b)
			System.out.println(a + "   " + b);
		else
			System.out.println(b + "  " + a);
	}

}
