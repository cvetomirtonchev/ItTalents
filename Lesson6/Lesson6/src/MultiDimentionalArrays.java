
public class MultiDimentionalArrays {

	public static void main(String[] args) {
		
		int x = 5;//creates 1 variable of type int
		//{0,0,0,0}
		int[] y = new int[4];//creates 4 variables of type int
		
		//{   0 1 2 3
		//0  {0,0,0,0}, 
		//1  {0,0,0,8}, 
		//2  {0,6,0,0}, 
		//3  {0,0,14,0}, 
		//4  {0,20,0,0}
		//}
		int[][] array2d = new int[5][4];//creates 5 variables of type int[], each of them with 4 variables of type int
		
		array2d[2][1] = 6;
		array2d[1][3] = 8;
		array2d[3][2] = array2d[2][1] + array2d[1][3];
		array2d[4][1] = array2d[2][1] + array2d[3][2];
	
		for(int row = 0; row < array2d.length; row++){
			for(int col = 0; col < array2d[row].length; col++){
				System.out.print(array2d[row][col] + ", ");
			}
			System.out.println();
		}
		
	}
}
