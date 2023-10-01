package com.champlain.oop2assignment2;

import java.util.Comparator;

public class FirstRankComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int rankCompare = card1.getRank().compareTo(card2.getRank()); // compare by rank

        // if rank is the same
        if (rankCompare == 0) {
            return card1.getSuit().compareTo(card2.getSuit());
        } else {
            return rankCompare;
        }
    }
}
