import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		int collons = sc.nextInt();
		int spaces = collons-1;
		for (int i = 0; i < collons; i++) {
			System.out.print(" - ");
			for (int j = 0; j < spaces; j++) {
				System.out.print(" + ");
				
			}
		spaces--;
	   System.out.println();
		
			
		}
	}

}
