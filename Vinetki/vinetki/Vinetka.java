<<<<<<< HEAD
package vinetki;

import java.util.jar.Attributes.Name;

import vinetki.Vinetka.AutoType;
import vinetki.Vinetka.DurationType;

public  class Vinetka implements Comparable<Vinetka>{
	
	@Override
	public String toString() {
		return "for: "+this.duration +" price: "+ this.price;
	}


	public enum AutoType{
		CAR("Blue",5),TRUCK("Red",7),BUS("Green",9);
		private String color;
		private int price;
		
		private AutoType(String color, int price) {
			this.color = color;
			this.price = price;
		}
		
	}
	public enum DurationType{
		DAYLY(1),MOUNTLY(10),EARLY(60);
	
		private int multiplier;
		
		private DurationType(int multiplier) {
			this.multiplier = multiplier;
		}
	}
	
	private AutoType type;
	private DurationType duration;
	private int price;
	
    public Vinetka(AutoType type, DurationType srok) {
		
		this.type = type;
		this.duration = srok;
		this.price = calcPrice();
	}

	private int calcPrice() {
		return type.price*duration.multiplier;
	}

	public AutoType geType(){
		return type;
	}


	@Override
	public int compareTo(Vinetka arg0) {
		
		return this.type.compareTo(arg0.type);
	}
	public int getPrice(){
		return type.price;
	}
	
	
	
	
}
=======
package vinetki;

import java.util.jar.Attributes.Name;

import vinetki.Vinetka.AutoType;
import vinetki.Vinetka.DurationType;

public  class Vinetka implements Comparable<Vinetka>{
	
	@Override
	public String toString() {
		return "for: "+this.duration +" price: "+ this.price;
	}


	public enum AutoType{
		CAR("Blue",5),TRUCK("Red",7),BUS("Green",9);
		private String color;
		private int price;
		
		private AutoType(String color, int price) {
			this.color = color;
			this.price = price;
		}
		
	}
	public enum DurationType{
		DAYLY(1),MOUNTLY(10),EARLY(60);
	
		private int multiplier;
		
		private DurationType(int multiplier) {
			this.multiplier = multiplier;
		}
	}
	
	private AutoType type;
	private DurationType duration;
	private int price;
	
    public Vinetka(AutoType type, DurationType srok) {
		
		this.type = type;
		this.duration = srok;
		this.price = calcPrice();
	}

	private int calcPrice() {
		return type.price*duration.multiplier;
	}

	public AutoType geType(){
		return type;
	}


	@Override
	public int compareTo(Vinetka arg0) {
		
		return this.type.compareTo(arg0.type);
	}
	public int getPrice(){
		return type.price;
	}
	
	
	
	
}
>>>>>>> 3929b29723bd642a520be8e9247116168bab8e63
