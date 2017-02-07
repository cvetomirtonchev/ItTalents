package naSelo;

public class NaSelo {

	public static void main(String[] args) {
		
		Cow minka = new Cow("Minka", 5);
		Pig gosho = new Pig("Gosho", 1);
		Marmot misha = new Marmot("Misha", 24);
		
		
		Obor obor = new Obor(5);
		
		obor.addAnimal(minka);
		obor.addAnimal(misha);
		obor.addAnimal(gosho);
		obor.addAnimal(new Marmot("Misho", 33));
		
		obor.disturbAnimals();
	}
}
