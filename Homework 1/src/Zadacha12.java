import java.util.Scanner;

public class Zadacha12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day, month, year;
		System.out.println("Enter days: ");
		day = input.nextInt();
		System.out.println("Enter month: ");
		month = input.nextInt();
		System.out.println("Enter year: ");
		year = input.nextInt();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day == 31 && month == 12) {
				day = 1;
				month = 1;
				year++;
			} else if (day == 31 && month != 12) {
				month++;
				day = 1;
			} else {
				day++;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day == 30) {
				day = 1;
				month++;
			} else {
				day++;
			}
		} else {
			if (isLeapYear && day == 29) {
				day = 1;
				month++;
			} else if (!isLeapYear && day == 28) {
				day = 1;
				month++;
			} else {
				day++;
			}
		}
		System.out.println(day + "." + month + "." + year);
	}

}
