package eden;

public class Cyborg {

	String model;
	int power;
	double weight;
	boolean canShootLazers;
	
	public Cyborg(String model, int power, double weight) {
		this.model = model;
		this.power = power;
		this.weight = weight;
	}
	
	public Cyborg(String model, int power, double weight, boolean canShootLazers) {
		this(model, power, weight);
		this.canShootLazers = canShootLazers;
	}

	public String getModel() {
		return model;
	}

	public int getPower() {
		return power;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isCanShootLazers() {
		return canShootLazers;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setCanShootLazers(boolean canShootLazers) {
		this.canShootLazers = canShootLazers;
	}
	
	
	
	
}
