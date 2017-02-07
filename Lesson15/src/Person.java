
public class Person {

	String name;
	int age = 8;
	String eyeColor = "Green";
	double weight = 2.6;
	char gender = 'm';
	Person friend;
	
	void eat(double foodWeight){
		weight += foodWeight;
	}
	
	void growUp(){
		age++;
	}
	
	void sleep(int hours){
		System.out.println(name + " is sleeping for " + hours + " hours ");
		weight-=hours;
	}
	
}
