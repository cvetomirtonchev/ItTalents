package library;

import java.time.LocalDate;



public class Magazine extends ReadingObject{

	enum Category implements IGroup {SCIENCE, NATURE, GOSSIP, LIFESTYLE};
	private int number;
	private LocalDate issueDate;
	private Category category;
	
	public Magazine(String name, String publisher, int number, LocalDate issueDate, Category category) {
		super(name, publisher, ReadingType.MAGAZINE);
		this.number = number;
		this.issueDate = issueDate;
		this.category = category;
	}


	@Override
	public Category getGroup() {
		return category;
	}
	
	@Override
	public int compareTo(ReadingObject o) {
		Magazine other = (Magazine) o;
		if(this.name.compareTo(other.name) == 0){
			return this.number - other.number;
		}
		return this.name.compareTo(other.name);
	}
	
}
