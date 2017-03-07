
public class Zadacha3126 {

	public static void main(String[] args) {
		int[]arr1 = {1,2,3,3,4,5,6};
		int []arr2 = {4,5,6,7,4,5,6,4,4};
		sbor(arr1,arr2);

	}
	static void sbor (int[]arr1,int[]arr2){
		int []arr3=new int [arr1.length+arr2.length];
		int counter = 0;
		for (int i = 0;i<arr3.length;i++){
			if (i<arr1.length){
			arr3[i]=arr1[i];
			}
			if(i>=arr1.length){
				arr3[i]=arr2[counter];
				counter++;
				
			}
		}
		
			
			
			
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+ " ");
		}
	}
}
