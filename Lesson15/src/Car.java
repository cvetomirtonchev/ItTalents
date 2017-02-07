
public class Car {

	String model;
	int maxSpeed;
	int currentSpeed;
	int currentGear;
	String color;
	String licencePlate;
	Person owner;
	
	void accelerate(){
		if(currentSpeed < maxSpeed){
			currentSpeed++;
		}
	}
}
