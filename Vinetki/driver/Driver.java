<<<<<<< HEAD
package driver;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import Vihicle.Vehicle;
import Vihicle.Vehicle.ModelType;
import vinetki.Vinetka;

public class Driver {

	
	private String name;
	private HashMap<ModelType , ArrayList<Vehicle>> cars ;
	private double money;
	private GasStation benzinostanciq;
	
	public Driver(String name, double money) {
		if(!name.isEmpty()&&!name.equals(" "))
		this.name = name;
		else{
			this.name = "John Doe ";
		}
		if(money>0){
		this.money = money;
		}
		else {
			this.money=0;
		}
		this.cars = new HashMap<>();
		cars.put(ModelType.CAR, new ArrayList<>());
		cars.put(ModelType.BUS, new ArrayList<>());
		cars.put(ModelType.TRUCK, new ArrayList<>());
	}
	
	public void getVehicle(Vehicle a){
		ModelType type = a.getType();
		if(!cars.containsKey(type)){
			cars.put(type, new ArrayList<>());
		}
		cars.get(type).add(a);
		
	}
	
	

	
	

}
=======
package driver;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import Vihicle.Vehicle;
import Vihicle.Vehicle.ModelType;
import vinetki.Vinetka;

public class Driver {

	
	private String name;
	private HashMap<ModelType , ArrayList<Vehicle>> cars ;
	private double money;
	private GasStation benzinostanciq;
	
	public Driver(String name, double money) {
		if(!name.isEmpty()&&!name.equals(" "))
		this.name = name;
		else{
			this.name = "John Doe ";
		}
		if(money>0){
		this.money = money;
		}
		else {
			this.money=0;
		}
		this.cars = new HashMap<>();
		cars.put(ModelType.CAR, new ArrayList<>());
		cars.put(ModelType.BUS, new ArrayList<>());
		cars.put(ModelType.TRUCK, new ArrayList<>());
	}
	
	public void getVehicle(Vehicle a){
		ModelType type = a.getType();
		if(!cars.containsKey(type)){
			cars.put(type, new ArrayList<>());
		}
		cars.get(type).add(a);
		
	}
	
	

	
	

}
>>>>>>> 3929b29723bd642a520be8e9247116168bab8e63
