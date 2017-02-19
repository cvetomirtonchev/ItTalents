package library;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

import library.ReadingObject.IGroup;
import library.ReadingObject.ReadingType;

public class Lybraly {
	
	
	private String name;
	private HashMap<ReadingType, HashMap<IGroup, TreeSet<ReadingObject>>> catalog;
	private ArrayList<ReadingObject> givenBooks;
	
	public Lybraly(String name) {
		this.name = name;
		this.catalog = new HashMap<>();
		this.catalog.put(ReadingType.BOOK, new HashMap<>());
		this.catalog.put(ReadingType.MAGAZINE, new HashMap<>());
		this.catalog.put(ReadingType.TEXTBOOK, new HashMap<>());
		this.givenBooks = new ArrayList<>();
	}
	
	public void addReadingObj(ReadingObject obj) {
		ReadingType type = obj.getType();
		if(!catalog.containsKey(type)){
			catalog.put(type, new HashMap<>());
		}
		IGroup group = obj.getGroup();
		if(!catalog.get(type).containsKey(group)){
			catalog.get(type).put(group, new TreeSet<>());
		}
		catalog.get(type).get(group).add(obj);
	}
	public void printCatalog(){
		System.out.println("<<<<<<<<<<WELCOME TO "+this.name+">>>>>>>>>>");
		for(Entry<ReadingType, HashMap<IGroup, TreeSet<ReadingObject>>> e : catalog.entrySet()){
			System.out.println("     -"+e.getKey());
			for(Entry<IGroup, TreeSet<ReadingObject>> e1 : e.getValue().entrySet()){
				for (ReadingObject ro : e1.getValue() ) {
					System.out.println(             "-----------*"+ro);
					
				}
			}
		}

	}
	public void addedObjects(){
		int counter = 0;
		for(Entry<ReadingType, HashMap<IGroup, TreeSet<ReadingObject>>> e : catalog.entrySet()){
			for(Entry<IGroup, TreeSet<ReadingObject>> e1 : e.getValue().entrySet()){
				    counter+=e1.getValue().size();
					
					}
		}
		System.out.println(counter);
	}
	public void giveBook(Person person,String name) {
		
	
		for(Entry<ReadingType, HashMap<IGroup, TreeSet<ReadingObject>>> e : catalog.entrySet()){
			for(Entry<IGroup, TreeSet<ReadingObject>> e1 : e.getValue().entrySet()){
				for (ReadingObject ro : e1.getValue() ) {
					if(name.equals(ro.name)){
						person.getKnigi().add(ro);
						givenBooks.add(ro);
						e1.getValue().remove(ro);
						
					}
					
					
					
				}
			
			}
				
					
			}
		

	}
	
		
	



	
	

	

}
