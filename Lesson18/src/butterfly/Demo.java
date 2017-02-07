package butterfly;

import zoo.Tiger;

public class Demo {

	public static void main(String[] args) {
		
		Butterfly peperuda1 = new Butterfly("Blue", 10);
		Butterfly peperuda2 = new Butterfly("Blue", 10);
		
		
		
		System.out.println(peperuda1.equals(peperuda2));
		
		String text = "krasi";
		String text2  = "Lisko";
		
		System.out.println(peperuda1.equals(new Tiger("Gencho")));
	}

}
