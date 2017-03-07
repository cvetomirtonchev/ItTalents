import java.util.Scanner;

public class Zadacha14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, b;
		int c, d;
		System.out.println("Please, enter a value for A : ");
		a = input.nextInt();
		System.out.println("Please, enter a value for B : ");
		b = input.nextInt();
		System.out.println("Please, enter a value for C : ");
		c = input.nextInt();
		System.out.println("Please, enter a value for D : ");
		d = input.nextInt();
		if((a%2 == 0 && b%2!=0) && (c%2 != 0 && d%2==0)){
			System.out.println("They are on the same color"); //Бяло
		}
		else if((a%2 != 0 && b%2==0) && (c%2 == 0 && d%2!=0)){
			System.out.println("They are on the same color"); //Черно
		}
		else{
			System.out.println("They are not on the same color");
		}
}

}
