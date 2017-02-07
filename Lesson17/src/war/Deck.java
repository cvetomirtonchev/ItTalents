package war;

import java.util.Random;

public class Deck {

	private final Card[] cards;
	static final int MAX_CARDS_IN_DECK = Card.RANKS.length*Card.SUITS.length;
	private int drawnCards = 0;
	
	Deck(){
		cards = new Card[MAX_CARDS_IN_DECK];
		int idx = 0;
		for (int i = 0; i < Card.RANKS.length; i++) {
			for (int j = 0; j < Card.SUITS.length; j++) {
				Card card = new Card(Card.RANKS[i], Card.SUITS[j]);
				cards[idx++] = card;
			}
		}
	}

	public void printCards() {
		for (int i = drawnCards; i < cards.length; i++) {
			System.out.println(cards[i].getInfo());
		}
	}
	
	public void shuffle(){
		for (int i = drawnCards; i < cards.length; i++) {
			int idx = new Random().nextInt(MAX_CARDS_IN_DECK);
			Card temp = cards[i];
			cards[i] = cards[idx];
			cards[idx] = temp;
		}
	}
	
	public Card drawCard(){
		Card card = this.cards[drawnCards];
		this.cards[drawnCards] = null;
		drawnCards++;
		return card;
	}
}
