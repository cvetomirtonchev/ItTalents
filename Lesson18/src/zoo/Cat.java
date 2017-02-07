package zoo;

public class Cat extends Mammal {

	Cat(String name) {
		super(name);
		//System.out.println("a cat with name is born");
	}
	
	protected void scratch(){
		System.out.println("dras dras");
	}
	
	void makeNoise(){
		System.out.println("miau miau");
	}
	
	Cat getBrother(){
		return null;
	}

}
