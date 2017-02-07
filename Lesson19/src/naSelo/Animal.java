package naSelo;

public abstract class Animal {
	
	private int age;
	private String name;
	
	public Animal(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	private abstract void doSmth();
	
	void eat(){
		System.out.println("nom nom");
	}

	protected abstract void makeNoise();
	
}
