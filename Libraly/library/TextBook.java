package library;



public class TextBook extends ReadingObject {

	enum Theme implements IGroup {GEOGRAPHY, HISTORY, MATHS, PROGRAMMING};
	private String author;
	private Theme theme;

	public TextBook(String name, String publisher, String author, Theme theme) {
		super(name, publisher, ReadingType.TEXTBOOK);
		this.author = author;
		this.theme = theme;
	}

	@Override
	public Theme getGroup() {
		return theme;
	}

	@Override
	public int compareTo(ReadingObject o) {
		TextBook other = ( TextBook ) o;
		return this.name.compareTo(other.name);
	}

	
}