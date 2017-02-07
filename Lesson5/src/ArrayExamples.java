
public class ArrayExamples {

	public static void main(String[] args) {
		
		int x1 = 4;
		int x2 = 5;
		int x3 = 12;
		//many more
		
		//int[] numbers = new int[5];//creates 5 variables of type int and value = 0
		
		int[] numbers = {4,5,7,6,9,3,7,5,6,2,2,1};//creates 12 variables of type int with corresponding value
		
		//System.out.println(numbers[11]);
		
		int[] grades = new int[500];// {0,4,0,9,13}
		
		grades[1] = 4;
		grades[3] = 9;
		grades[4] = grades[1] + grades[3];
		
		for(int i = 0; i < grades.length; i++){
			System.out.println(grades[i]);
		}
		
		
	}
}
