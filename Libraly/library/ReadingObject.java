package library;

public abstract class ReadingObject implements Comparable<ReadingObject>{


	public String getName() {
		return name;
	}

	interface IGroup {}
	enum ReadingType {BOOK,MAGAZINE,TEXTBOOK;}
	protected String name;
	private String publisher;
	private ReadingType type;
	
	public ReadingObject(String name, String publisher, ReadingType type) {
		this.name = name;
		this.publisher = publisher;
		this.type = type;
	}
	public ReadingType getType() {
		return type;
	}
	
	public abstract IGroup getGroup();
	
	@Override
	public String toString() {
		return this.name + " by " + this.publisher;
	}
	
   




	
	
	

}
