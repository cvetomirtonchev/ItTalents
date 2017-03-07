
public class Zadacha4126 {

	public static void main(String[] args) {
		int a = 6;
		int b = 7;
		int [][]arr = metod(a,b);
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
				
			}
			
		}
				
	}
	static int [][]metod(int a, int b){
		int [][]arr = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=0;
				
			}
		}
		
		
		
		
		
		
		
		
		
		return arr;
		
	}














}

	


