package zoo;

public class Tiger extends Cat{

	public Tiger(String name) {
		super(name);
		super.age = 56;
	}

	@Override
	public void scratch() {
		System.out.println("dras");
		super.scratch();
	}
	
	void makeNoise(){
		System.out.println("grrrrr!");
	}
	
	@Override
	Tiger getBrother() {
		return null;
	}
	

}
