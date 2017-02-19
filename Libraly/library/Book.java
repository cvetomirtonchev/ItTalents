package library;

import java.time.LocalDate;

public class Book extends ReadingObject  {

	enum Genre implements IGroup {
		ACTION, DRAMA, COMEDY
	}

	private String author;
	
	private LocalDate issueDate;
	private Genre genre;

	public Book(String name, String publisher, String author, LocalDate issueDate, Genre genre) {
		super(name, publisher, ReadingType.BOOK);
		this.author = author;
		this.issueDate = issueDate;
		this.genre = genre;

	}

	@Override
	public int compareTo(ReadingObject o) {
		Book other = (Book) o;
		return this.author.compareTo(other.author);
	}

	@Override
	public Genre getGroup() {
	
		return genre;
	}

	
	
}
