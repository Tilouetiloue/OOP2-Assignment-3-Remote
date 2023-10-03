package com.champlain.oop2assignment2;

import java.util.Comparator;

public class SuitFirstComparator implements Comparator<Card>  {
    @Override
    public int compare(Card card1, Card card2) {
        int suitCompare = card1.getSuit().compareTo(card2.getSuit()); // compare by suit

        // if suit is the same
        if (suitCompare == 0) {
            return card1.getRank().compareTo(card2.getRank());
        } else {
            return suitCompare;
        }
    }
}
