package crypton;

public class Alien {

	String name = "Stavri";
	int antennas;
	String color;
	int age;
	boolean hasTenticles;

	Alien(String name){
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		System.out.println("first constructor with name");
	}
	
	Alien(String name, int age){
		this(name);//call constructor Alien(name);
		if(age > 0){
			this.age = age;
		}
		System.out.println("second constructor with name and age");
	}
	
	Alien(String name, int age, String color){
		this(name, age);//call constructor Alien(name, age);
		if(color != null && !color.isEmpty()){
			this.color = color;
		}
		System.out.println("third constructor with name, age and color");
	}
	
}
