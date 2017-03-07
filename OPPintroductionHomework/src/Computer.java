
public class Computer {
	String name;
	String year ;
	double price;
	Boolean isNoteBook ;
	double hardDiskMemory;
	int freeMemory;
	String operatingSystem;
	
	Computer(){
		this.isNoteBook = false;
		this.operatingSystem= "Win Xp";
		
	}
	
	
	
	public Computer(String year,double price, double hardDiskMemory, int freeMemory) {
		this();
		this.year = year;
		this.price = price ;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}


	

	
	
	
	public Computer(String name, String year, Double price, Boolean isNoteBook, double hardDiskMemory, int freeMemory,
			String operatingSystem) {
		
		this.name = name;
		this.year = year;
		this.price = price;
		this.isNoteBook = isNoteBook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operatingSystem = operatingSystem;
	}
	int compare(Computer computer){
		if(this.price==computer.price){
		System.out.println("The two computers are with the same price");
			return 0;
		
		}
		if(this.price>computer.price){
			System.out.println("The first computer is more expensive");
			return 1;
		}
		else{
			System.out.println("The second computer is more expensive");
			return -1;
		}
		
	}



	void changeOperatingSystem(String newOperatingSystem){
		operatingSystem = newOperatingSystem;
		
		
	}
	void useMemory(int memory){
		if(memory>freeMemory){
			System.out.println("Not enought free memory");
		}
		else {
			freeMemory-=memory;
		}
	}

	

}
