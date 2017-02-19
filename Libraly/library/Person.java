package library;

import java.util.ArrayList;
import java.util.HashMap;

import javax.print.event.PrintJobAttributeListener;

public class Person {
	private String name ;
	private ArrayList<ReadingObject> knigi ;
	public Person(String name) {
		
		this.name = name;
		knigi = new ArrayList< >();
	}
	
	public ArrayList<ReadingObject> getKnigi() {
		return knigi;
	}	
		
		
	public void printGettedBooks() {
		for (ReadingObject readingObject : knigi) {
			System.out.println(readingObject);
			
		}

	}
	
	
	

}
