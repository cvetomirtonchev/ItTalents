package war;

public class Card {
	static final char[] RANKS = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
	static final String[] SUITS = {"clubs", "diamonds", "hearts", "spades"}; 
	

	private final char rank;
	private final String suit;
	private int strength;
	
	public Card(char rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public boolean isGreaterThan(Card c){
		return this.strength > c.strength;
	}
	
	public boolean isEqualTo(Card c){
		return this.strength == c.strength;
	}

	public String getInfo() {	
		return this.rank + " of " + this.suit;
	}
}
