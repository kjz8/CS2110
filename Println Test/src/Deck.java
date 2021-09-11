/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 */ 

import java.util.*;



public class Deck {

    public static int numSuits = Card.Suit.values().length;
    public static int numRanks = Card.Rank.values().length;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public Deck() {
    	int suit=0;
    	int rank=0;
        cards = new Card[numSuits][numRanks];
        for(int s=0;s<Card.Suit.values().length;s++) {
            for(int r=0;r<Card.Rank.values().length;r++) {
            	Card c=new Card(Card.Rank.values()[r],Card.Suit.values()[s]);
                cards[suit][rank++] = c;
                
            }
            suit++;
            rank=0;
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit][rank];
    }
}