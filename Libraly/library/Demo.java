package library;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale.Category;

import library.Book.Genre;
import library.ReadingObject.ReadingType;
import library.TextBook.Theme;

import java.util.TreeSet;


public class Demo {

	public static void main(String[] args){
		
		
		Lybraly lib = new Lybraly("Sofia lybraly");
		
		Book kniga1 = new Book("Book of Jungle", "EURO AD","Augostine Viurt", LocalDate.now(), Genre.DRAMA);
		Book kniga2 = new Book("Harry Potter", "Juan Rolling","Prosveta", LocalDate.now(), Genre.ACTION);

		TextBook uchebnik = new TextBook("Bulgarian for 9th Grade", "Prosveta","Ivan Radev", Theme.GEOGRAPHY);
		Magazine spisanie = new Magazine("Playboy", "playboyLTD", 4, LocalDate.now(), library.Magazine.Category.GOSSIP);
		
		lib.addReadingObj(uchebnik);
		lib.addReadingObj(kniga1);
		lib.addReadingObj(kniga2);
		lib.addReadingObj(spisanie);
		
		
		lib.printCatalog();
		lib.addedObjects();
		
		Person gosho = new Person("Georgi");
		
		lib.giveBook(gosho, "Book of Jungle");
		
		gosho.printGettedBooks();
		
		lib.printCatalog();
		
		
		
	}
}
