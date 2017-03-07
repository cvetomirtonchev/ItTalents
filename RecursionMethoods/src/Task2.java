import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two prime numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int result = sum(number1,number2);
		System.out.println(result);
	}

	static int sum(int a , int times){
		if (times==1){
			return a;
		}
		return a + sum(a,times - 1);
	}
	}
	