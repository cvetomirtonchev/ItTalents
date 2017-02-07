
public class Java1 {
	public static void main(String[] args) {
		trianglePrint(1, 3);

	}

	public static void trianglePrint(int start, int end) {
		if (start < end ) {
			if (end == 0) {
				return;
			}
			trianglePrint(start, end - 1);

			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");

			}
			System.out.println();

		}
		if (end < start) {
			if (start == 0) {
				return;
			}
			trianglePrint(start - 1, end);

			for (int i = end; i <= start; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}
