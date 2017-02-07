import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		//1 - input a positive number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int n = sc.nextInt();
		//2 - keep trying until positive
		while(n <= 0){
			System.out.println("Abe ti ne chetesh li? Dai polojitelno!");
			n = sc.nextInt();
		}
		//3 - create array of n cells
		double[] arr = new double[n];
		//4 - fill all cells with number 7.0
		//5 - print all cells of array
		for(int i = 0; i < arr.length; i++){
			arr[i] = 7;
			System.out.println(arr[i]);
		}
	}
}
