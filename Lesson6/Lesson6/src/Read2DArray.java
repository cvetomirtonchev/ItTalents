import java.util.Scanner;

public class Read2DArray {

	public static void main(String[] args) {
		
		//read rows and cols from console
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Please enter number of columns");
		int cols = sc.nextInt();
		//create the array
		int[][] masiv = new int[rows][cols];
		//ask for each cell 
		for(int i = 0; i < masiv.length; i++){//for each row
			for(int j = 0; j < masiv[i].length; j++){//for each column
				System.out.println("Please enter a value for the cell [" + i + "][" + j + "]");
				masiv[i][j] = sc.nextInt();
			}
		}
		System.out.println("Done");
		//print the array
		for(int i = 0; i < masiv.length; i++){//for each row
			for(int j = 0; j < masiv[i].length; j++){//for each column
				if(j == masiv[i].length-1){//last column
					System.out.print(masiv[i][j]);
				}
				else{
					System.out.print(masiv[i][j] + ", ");
				}
			}
			System.out.println();
		}
		
	}
}
