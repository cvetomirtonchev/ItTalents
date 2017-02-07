package naSelo;

public class Marmot extends Animal {

	public Marmot(String name, int age) {
		super(name, age);
	}

	@Override
	protected void makeNoise() {
		System.out.println("zvuk ot staniol");
	}

}
