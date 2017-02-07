import java.util.Scanner;

public class Zadacha15 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		int time ;
		System.out.println("Колко е часа: ");
		time = ch.nextInt();
		switch (time){
		case 1:
		case 2:
		case 3:
		case 4:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 00:
			System.out.println("Добър вечер");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Добро утро");
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			System.out.println(" Добър ден ");
			break;
			default:
				System.out.println("Няма такъв час");
				break;
		
	}

}
}