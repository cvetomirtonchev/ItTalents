import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		int digit;
		System.out.println("Въведете трициферно число");
		digit = ch.nextInt();
		int firstNumber = (digit / 100);
		int secondNumber = ((digit / 10) % 10);
		int thirdNumber = (digit % 10);
		
        
		if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0)
			System.out.println("Не може да има 0 в числото");
		if ((digit%firstNumber)==0 && (digit%secondNumber)==0 && (digit%thirdNumber)==0)
			System.out.println(" Дели се на всяко едно от числата");
		else
			System.out.println(" Не се дели на всяко едно от числата");

	}

}
