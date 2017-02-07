import java.util.Scanner;

public class Zadacha5 {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		int a,b,c ;
		System.out.println("A:");
		a = sh.nextInt();
		System.out.println("B:");
		b = sh.nextInt();
		System.out.println("C:");
		c = sh.nextInt();
		
		if (a > b&&b >c)
			System.out.println(a +" "+b+" "+c);
		if (a >c&&a>b&&c>b)
			System.out.println(a +" "+c+" "+b);
		if (b > a&&a>c)
		System.out.println(b + " "+a+" " +c);
		if (b>c&&c>a&&b>a)
			System.out.println(b + " "+c+" "+a );
		if (c>a&&a>b)
			System.out.println(c+" "+a+" "+b);
		if (c>b&&b>a&& c>a)
			System.out.println(c+ " "+b+" " +a);
		
	}

}
