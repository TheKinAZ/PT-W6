package javaCodingFinal;

import java.util.ArrayList;
import java.util.List;

public class Players {
	private String name;
	private int score;
	private List<Card> hand;

	public Players(String name, int score) {
		this.name = name;
		this.score = score;
		this.hand = new ArrayList<Card>();
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	public Card flipCard() {
		return hand.remove(0);
	}

	public void incrementScore() {
		this.score++;
	}

	public String getName() {
		return this.name; //try "return name" is still not working
	}

	public void changeName(String name) {
		this.name = name;
	}
	public int getScore() {
		return this.score;
	}
	
	public void addPoints(int p) {
		this.score += p;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return this.hand; //or try "return hand;" if still failing
	}

	public void setHand(List <Card> hand) {
		this.hand = hand;
	}

	public void addCard(Card card) {
		this.hand.add(card);
	}

	public void removeCard(Card card) {
		this.hand.remove(card);
	}

	public Card flip() {
		return this.hand.remove(0);
	}

//	public void incrementScore1() {
//		this.score++;
//	}
	
} // end of class
