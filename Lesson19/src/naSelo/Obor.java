package naSelo;

public class Obor {

	private Animal[] jivotni;
	private int addedAnimals = 0;
	
	Obor(int mesta){
		jivotni = new Animal[mesta];
	}
	
	void addAnimal(Animal a){
		if(addedAnimals < jivotni.length){
			jivotni[addedAnimals++] = a;
		}
	}
	
	void disturbAnimals(){
		for (int i = 0; i < jivotni.length; i++) {
			if(jivotni[i] != null){
				jivotni[i].makeNoise();
			}
		}
	}
}
