
public class Zadacha2 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 5, 6, 7, 8 };
		int[] arr2 = new int[arr1.length];
		int flip = 0;
		System.out.print("[");
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];

			if (arr1.length / 2 > i) {
				System.out.print(arr2[i] + ",");
			}
		}
		for (int j = arr1.length - 1; j >= arr1.length / 2; j--) {
			arr2[j] = arr1[j];
			if (j != arr1.length - 1){
				System.out.print(","+arr2[j]);
			}
			else {
				System.out.print(arr2[j]);
			}

		}

		System.out.print("]");
	}

}
