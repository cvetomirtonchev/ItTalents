
public class Zadacha3 {
	public static void main(String[] args) {
		int[][] arr = { { 3, 4, 3, 4 }, 
				        { 4, 5, 6, 8 }, 
				        { 1, 2, 3, 4 } };
		double sum = arr[0][0];
		int num = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				num = num + arr[i][j];
				sum = num;

			}

		}
		System.out.println("The sum of the numbers are:" + sum);
		System.out.println("The averege of the sum are :" + sum / (arr.length * arr[0].length));

	}
}
