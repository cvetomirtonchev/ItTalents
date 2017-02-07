import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter one number : ");
	int number = sc.nextInt();
	boolean result = prime (number , 2);
	if (result){
		System.out.println("The number is prime");
	}
	else {
		System.out.println("The number is not prime");
	}
	
	}
	static boolean prime(int num, int counter){
		
		if(num <= 1 || num % counter == 0){
			return false;
		}
		if(counter == num - 1){
			return true;
		}
        return prime(num, counter + 1);
		}
		
	}

