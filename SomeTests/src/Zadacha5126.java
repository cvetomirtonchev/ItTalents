import java.util.Scanner;

public class Zadacha5126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fibonacci number");
		int number = sc.nextInt();
		int result = fibonacci(number);
		System.out.println(result);

	}
	static	int fibonacci(int n){	
		if(n==1){
			return 1;
			
		}
		if(n==2){
			return 1;
		}
		
			return fibonacci(n-1)+fibonacci(n-2);
		
		
	}
}
