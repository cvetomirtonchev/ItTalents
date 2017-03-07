import java.util.Scanner;

public class Zadacha2146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dumi1 = sc.next();
		String dumi2 =sc.next();
		int niz1 = dumi1.length();
		int niz2 = dumi2.length();
		if (niz1==niz2){
			System.out.println("Dvata niza sa ravni");
			for (int i = 1; i < dumi1.length(); i++) {
				if(dumi1.charAt(i)!=dumi2.charAt(i)){
					System.out.println(i+1 + " "+dumi1.charAt(i)+"-"+dumi2.charAt(i) );
				}
				
			}
			
		}
		else{
			System.out.println("Dvata niza ne sa ravni");
			
		}
		
		
	}

}
