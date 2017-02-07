
public class Zadacha4 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, 
		                { 5, 6, 7, 8 }, 
		                { 9, 10, 11, 12 }, 
		                {13, 14, 15, 16}};
		int[][] arr2 = new int [arr.length][arr[0].length];
		
		int c= 0;
		
		
		for (int i = 0;i<arr.length;i++){
			for (int j = arr.length-1;j>=0;j--){
				for (int g=0;g<arr.length;g++){
					if (c<arr.length){
					arr2[g][c]=arr[j][g];
					
					}
				}
			
				
				
				c++;}
		}
	
		for(int i = 0; i < arr2.length; i++){
			for(int j = 0; j < arr2[i].length; j++){
				if(j == arr[i].length-1){
					System.out.print(arr2[i][j]);
				}
				else{
					System.out.print(arr2[i][j] + ", ");
				}
			}
			System.out.println();

	}
	}
}
