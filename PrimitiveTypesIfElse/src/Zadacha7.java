import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {

		Scanner sh = new Scanner(System.in);
		int a;
		double b;
		boolean c;

		System.out.println("Час");
		a = sh.nextInt();
		System.out.println("Колко пари имам ?");
		b = sh.nextDouble();
		;
		System.out.println("Болен ли съм");
		c = sh.nextBoolean();

		if (c == true)
			System.out.println("Аз съм болен няма да излизам");
		if (b > 0 && c == true)
			System.out.println("Ще си купя лекарства");

		if (b == 0 && c == true)
			System.out.println("Ще си стоя вкъщи и ще пия чай");
		else if (b > 10 && c == false)
			System.out.println("Ще отида на кино");
		if (b < 10 && c == false)
			System.out.println("Ще отида на кафе");

	}
}