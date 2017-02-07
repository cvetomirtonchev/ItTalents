import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		int a, b;
		System.out.println("A:");
		a = sh.nextInt();
		System.out.println("B:");
		b = sh.nextInt();

		int l = a;
		a = b;
		b = l;
		System.out.println(a);
		System.out.println(b);
	}

}
