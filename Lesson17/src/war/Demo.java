package war;

public class Demo {

	public static void main(String[] args) {
		
		Deck teste = new Deck();
		teste.shuffle();
		teste.printCards();
		
		Card card = teste.drawCard();
		
		
		teste.printCards();
		
		Player p1 = new Player("Maria");
		Player p2 = new Player("Vlado");
		
		
	}
}
