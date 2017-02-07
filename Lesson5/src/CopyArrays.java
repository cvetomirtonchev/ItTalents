import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		
		int[] original = {6,6,2,5,3,5,3};
		
		int[] copyArr = new int[original.length];
		
		
		for(int i = 0; i < original.length; i++){
			copyArr[i] = original[i];
		}
		
		System.out.print("[");
		for(int i = 0; i < copyArr.length; i++){
			if(i == copyArr.length-1){
				System.out.print(copyArr[i]);
			}
			else{
				System.out.print(copyArr[i] + ",");
			}
		}
		System.out.print("]");
		

		
	}
}
