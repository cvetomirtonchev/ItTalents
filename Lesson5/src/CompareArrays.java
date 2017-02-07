
public class CompareArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {2,3,4,5,8};
		int[] arr2 = {2,3,4,5};
		
		boolean equal = true;
		
		if(arr1.length != arr2.length){
			equal = false;
		}
		else{//equal length -> check every single cell
			for(int i = 0; i < arr1.length; i++){
				if(arr1[i] != arr2[i]){
					equal = false;
					break;
				}
			}
		}
		
		if(equal){
			System.out.println("the arrays are the same");
		}
		else{
			System.out.println("the arrays are NOT the same");
		}
		
	}
}
