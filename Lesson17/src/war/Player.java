package war;

public class Player {

	private String name;
	private Card[] hand;
	int winnings;
	
	public Player(String name) {
		this.name = name;
		this.hand = new Card[26];
	}
	
	public void receiveCard(Card card){
		//...take it to your hand
	}
	
	public Card drawCard(){
		//remove from hand and return
		return null;
	}
	
	public void winCards(int cards){
		this.winnings+=cards;
	}
	
}
