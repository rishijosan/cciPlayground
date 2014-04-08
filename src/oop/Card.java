package oop;

enum Suit {joker, hearts, diamonds, clubs, spades}

public class Card {

	private Suit suit;
	private int num;
	
	public Card(Suit s, int num)
	{
		this.suit = s;
		this.num = num;
		
	}
	
	public String toString()
	{
		return num + " of " + suit.name();
	}
	
	public static void main(String[] args)
	{
		
		Card aceDi = new Card(Suit.diamonds , 1);
		
		System.out.println(aceDi);
		
	}
	
}
