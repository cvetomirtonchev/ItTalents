package naSelo;

public class Cow extends Animal{

	public Cow(String name, int age) {
		super(name, age);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Moo Moo");
	}

}
