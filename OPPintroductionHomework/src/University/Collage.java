package University;

public class Collage {

	public static void main(String[] args) {
		Student boiko = new Student("Boiko Borisov", "Izmama", 45);
		boiko.setGrade(5.50);
		Student cecka = new Student("Tsetska Tsacheva", "Izmama", 20);
		cecka.setGrade(4.00);
		Student volen = new Student("Volen Siderov","Izmama",29);
		volen.setYearsInCollage(3);
		Student gosho = new Student("Georgi Ivanov", "Informatika", 20);
		gosho.setYearsInCollage(2);
		Student petko = new Student("Petko Alexandrov", "Informatika", 20);
		petko.setYearsInCollage(4);;
		Student raicho = new Student("Raicho Cvetkov", "Informatika", 29);
		raicho.setGrade(5.00);
		Student petq = new Student("Petq Petrova", "Informatika", 24);
		petq.setGrade(3.50);
		Student niki = new Student("Nikolai Petrov", "Informatika", 50);
		niki.setGrade(6.00);
		Student ivana = new Student("Ivana Stoqnova", "Informatika", 21);
		Student petrana = new Student("Petrana Stamatova","Izmama",19);
		
		cecka.reciveScholarShip(3.50, 500.00);
		System.out.println(cecka.getMoney());
		boiko.reciveScholarShip(4.50, 520.00);
		volen.upYear();
		petko.upYear();
		
		StudentGroup informatika = new StudentGroup("Informatika");
		informatika.addStudent(gosho);
		informatika.addStudent(niki);
		informatika.addStudent(raicho);
		informatika.addStudent(ivana);
		informatika.addStudent(petko);
		informatika.addStudent(petq);
		
		informatika.printStudentsInGroup();
		informatika.theBestStudent();
		
		
		
		

	}

}
