import java.util.concurrent.SynchronousQueue;

public class demoComputer {

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		comp1.name = "Macbook Air";
		comp1.year="2014 година";
		comp1.price = 2000;
		comp1.isNoteBook = true;
		comp1.hardDiskMemory = 1024;
		comp1.freeMemory=1024;
		comp1.operatingSystem= "Mac";
		
		Computer comp2 = new Computer();
		comp2.name = "Hp";
		comp2.year="2015 година";
		comp2.price=2000.00;
		comp2.isNoteBook=false;
		comp2.hardDiskMemory=2048;
		comp2.freeMemory=2048;
		comp2.operatingSystem = "Linux";
		
		comp1.useMemory(100);
		comp2.changeOperatingSystem("Windows 10");
		
		System.out.println("Name: " + comp1.name);
		System.out.println("Year: " + comp1.year);
		System.out.println("Price: " + comp1.price );
		if (comp1.isNoteBook==true){
			System.out.println("NoteBook: " +"Yes");
			}
		else {
			System.out.println("NoteBook: " + "No" );
		}
		System.out.println("Hard drive memory: " + comp1.hardDiskMemory + "MB");
		System.out.println("Free hard drive memory: " + comp1.freeMemory + "MB");
		System.out.println("Operating system : "  + comp1.operatingSystem);
		System.out.println();
		System.out.println();
	
		System.out.println();
		System.out.println();
		
		System.out.println("Name: " + comp2.name);
		System.out.println("Year: " + comp2.year);
		System.out.println("Price: " + comp2.price );
		if (comp2.isNoteBook==true){
			System.out.println("NoteBook: " +"Yes");
			}
		else {
			System.out.println("NoteBook: " + "No" );
		}
		System.out.println("Hard drive memory: " + comp2.hardDiskMemory + "MB");
		System.out.println("Free hard drive memory: " + comp2.freeMemory + "MB");
		System.out.println("Operating system : "  + comp2.operatingSystem);
		
		System.out.println(comp1.compare(comp2));
	
		
		Computer comp3 = new Computer("1996 година",2012.00,1556,1556);
		comp2.compare(comp3);


	}

}
