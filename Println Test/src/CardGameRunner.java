/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 */ 

import java.util.*;




public class CardGameRunner {
    public static void main(String[] args) {
        Deck deck = new Deck(); //creates and loads all cards
        
        
        
        
        //for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
          //  for (int rank = Card.ACE; rank <= Card.KING; rank++) {
        
        for(int suit=0;suit<Card.Suit.values().length;suit++)
        {
        	for(int rank=0;rank<Card.Rank.values().length;rank++)
        	{
        		Card card=deck.getCard(suit, rank);
        		System.out.println(card.getSuit().name+" "+card.getRank().name);
        		
        		
                
            }
        }
    }
}