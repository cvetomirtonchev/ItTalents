<<<<<<< HEAD
package Vihicle;

import vinetki.Vinetka;

public class Vehicle {


	@Override
	public String toString() {
		return "Type: "+type+" Model: " + model +" Year: "+year;
	}
	public enum ModelType{CAR,BUS,TRUCK};
	private ModelType type;
	private String model;
	private Vinetka vinetka;
	private int year;
	private boolean hasVinete ;
	public Vehicle(String model, int year , ModelType type) {
		if(!model.isEmpty()&&!model.equals(" ")){
		this.model = model;
		}
		this.hasVinete=false;
		this.year = year;
		this.type=type;
	}
	
	public ModelType  getType() {
		return type;
	}
	
	

}
=======
package Vihicle;

import vinetki.Vinetka;

public class Vehicle {


	@Override
	public String toString() {
		return "Type: "+type+" Model: " + model +" Year: "+year;
	}
	public enum ModelType{CAR,BUS,TRUCK};
	private ModelType type;
	private String model;
	private Vinetka vinetka;
	private int year;
	private boolean hasVinete ;
	public Vehicle(String model, int year , ModelType type) {
		if(!model.isEmpty()&&!model.equals(" ")){
		this.model = model;
		}
		this.hasVinete=false;
		this.year = year;
		this.type=type;
	}
	
	public ModelType  getType() {
		return type;
	}
	
	

}
>>>>>>> 3929b29723bd642a520be8e9247116168bab8e63
