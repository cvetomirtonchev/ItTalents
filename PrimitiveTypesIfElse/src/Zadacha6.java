import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {

		Scanner sh = new Scanner(System.in);
		int a, b, c;
		System.out.println("A:");
		a = sh.nextInt();
		System.out.println("B:");
		b = sh.nextInt();
		System.out.println("C:");
		c = sh.nextInt();
		int L = a;
		int K = b;
        int P = c;
		a = b;
		b = L;
		c=b;
		c=K;
		a=c;
		a=P;
			
	
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
