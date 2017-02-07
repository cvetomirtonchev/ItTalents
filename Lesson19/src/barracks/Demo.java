package barracks;

public class Demo {

	public static void main(String[] args) {
		
		Explodable bomb = new Granade();
		bomb.blowUp(4, 4);
		bomb = new Dynamite();
		bomb.blowUp(4, 4);
		
	}
}
