import java.util.Scanner;

public class Zadacha3146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words");
		String name1 = "jaba";
		String name2 = "banka";
		String[] arr = name1.split("");
		String[] arr2 = name2.split("");
		String[][]masiv=new String[name1.length()][name2.length()];
		
		
		for (int i = 0; i < masiv.length; i++) {
			masiv[i][0]=arr[i];
			if(masiv[i][0]==arr2[0]){
				for (int j = 0; j < arr2.length; j++) {
					masiv[i][j]=arr2[j];
					
				}
			}
		
		}
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[i].length; j++) {
				System.out.print(masiv[i][j]);
				
			}
		System.out.println();
		}
			
		}

}
