package naSelo;

public class Pig extends Animal{

	public Pig(String name, int age) {
		super(name, age);
	}

	@Override
	protected void makeNoise() {
		System.out.println("gruh gruh");
	}

}
