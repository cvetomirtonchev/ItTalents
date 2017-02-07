import java.util.Scanner;

public class Zadacha13 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);

		int temperature;

		System.out.println(" Въведете колко градуса е навън: ");

		temperature = ch.nextInt();
		if (temperature < -100 && temperature > 100)
			System.out.println("Невъзможен отговор");
		if (temperature < -20)
			System.out.println("Навън е ледено студено");
		if (temperature > -20 && temperature < 0)
			System.out.println("Навън е студено");
		if (temperature > 0 && temperature < 15)
			System.out.println("Навън е хладно");
		if (temperature > 15 && temperature < 25)
			System.out.println("Навън е топло");
		if (temperature > 25)
			System.out.println("Навън е горещо");
	}

}
