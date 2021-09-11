/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 */ 

public class Card {
	
	enum Rank {
		ACE(1,"ACE"), DUECE(2,"DUECE"),THREE(3,"THREE"),FOUR(4,"FOUR")
		,FIVE(5,"FIVE"),SIX(6,"SIX"),SEVEN(7,"SEVEN"),EIGHT(8,"EIGHT"),NINE(9,"NINE"),
		JACK(10,"JACK"),QUEEN(11,"QUEEN"),KING(12,"KING");
		int num;
		String name;
		Rank(int Num,String Name)
		{
			num=Num;
			name=Name;
		}
	}
	enum Suit {
		DIAMONDS(1,"DIAMOND"), CLUBS(2,"CLUB"),HEARTS(3,"HEARTS"),SPADES(4,"SPADE");
		int num;
		String name;
		Suit(int Num,String Name)
		{
			num=Num;
			name=Name;
		}
	}
    //private final int rank;
	private Rank rank;
    //private final int suit;
	private Suit suit;

    // Kinds of suits
    public final static int DIAMONDS = 1;
    public final static int CLUBS    = 2;
    public final static int HEARTS   = 3;
    public final static int SPADES   = 4;

    // Kinds of ranks
    public final static int ACE   = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public static boolean isValidRank(int rank) {
        return ACE <= rank && rank <= KING;
    }

    public static boolean isValidSuit(int suit) {
        return DIAMONDS <= suit && suit <= SPADES;
    }

 
}