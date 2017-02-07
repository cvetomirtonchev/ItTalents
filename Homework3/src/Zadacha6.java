
public class Zadacha6 {

	public static void main(String[] args) {
		int []arr1 = { 1,2,3,4,5,6};
		int []arr2 = { 2,3,4,5,6,4};
        int sum1 = 0;
        int sum2 = 0 ;
		for (int i = 0;i<=arr1.length;i++){
			sum1 = i;
		}
		
		for (int i = 0;i<=arr2.length;i++){
			sum2 = i;
		}
		if (sum1!=sum2){
			System.out.println("Their length are not equal");
		}
		else {
			System.out.println("They are equal");
		}
		}

}
