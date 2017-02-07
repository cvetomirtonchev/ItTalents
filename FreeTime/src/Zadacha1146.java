import java.util.Scanner;

public class Zadacha1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to words");
		String dumi = sc.nextLine();
		String[] razdeleni = dumi.split(" ");
		int max = razdeleni[0].length();
		String switch1 = razdeleni[0].substring(0,5);
		String switch2 = razdeleni[1].substring(0,5);
		String swtich3= razdeleni[0].substring(5);
		String swtich4= razdeleni [1].substring(5);
		for (int i = 1; i < razdeleni.length; i++) {
			if(max<razdeleni[i].length()){
				max=razdeleni[i].length();
				System.out.println (max +" "+switch1+swtich4);
			}
			else {
				System.out.print(max +" "+ switch2+swtich3);
			}
			
		}
	

		
	}

}
