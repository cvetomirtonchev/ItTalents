
public class CarDemo {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.model = "Golf 2";
		
		Person stamat = new Person();
		stamat.age = 24;
		stamat.weight = 130;
		stamat.name = "Stamat Jelqzkov";
		
		Person minka = new Person();
		minka.name = "Minka Vinkelova";
		minka.weight = 110;
		minka.age = 54;
		
		System.out.println(stamat.weight);
		stamat.eat(2.1);
		System.out.println(stamat.weight);
		stamat.eat(5);
		System.out.println(stamat.weight);
		
		stamat.sleep(5);
		minka.sleep(13);
		
		stamat.friend = minka;
		System.out.println("Stamat si ima priqtel: " + stamat.friend.name);
		
		Car car2 = new Car();
		car2.model = "Golf 3 GT";
		car2.color = "Pink";
		car2.maxSpeed = 256;
		car2.currentSpeed = 120;
		car2.currentGear = 2;
		car2.licencePlate = "PK 5527 AH";
		car2.owner = stamat;
		System.out.println(car2.owner.age);
		car2.owner = minka;
		System.out.println(car2.owner.age);
		
		for (int i = 0; i < 400000; i++) {
			car2.accelerate();
		}
		
		System.out.println(car2.currentSpeed);
	}
}
