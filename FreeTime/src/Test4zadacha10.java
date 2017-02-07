
public class Test4zadacha10 {

	public static void main(String[] args) {
		int arr[] = {10,7,70 };

		findExtremum(arr);

	}

	static void findExtremum(int[] arr) {
		int counterForhulm = 0;
		int counterForPadina = 0;
		boolean hulm = false;
		boolean padina = false;
		boolean change = false;
		boolean change2 = false;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]&&change2==false) {
				counterForhulm++;
				hulm = true;
				change = true;

			}
			if (arr[i] < arr[i - 1] && change == false) {
				counterForPadina++;
				padina = true;
				change2=true;
				

			}
		}
		if (padina) {
			System.out.println(counterForPadina + "Padina");
		}
		if (hulm) {
			System.out.println(counterForhulm + "Hulm");
		}

	}
}
