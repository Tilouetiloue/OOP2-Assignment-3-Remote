package com.champlain.oop2assignment2;

import java.util.List;

public class NumberOfAcesStrategy implements ScoringStrategy {
    @Override
    public int calculateScore(List<Card> plist) {
        int count = 0;

        for (Card card : plist) {
           if (card.getRank() == Rank.ACE) {
               count++;
           }
        }
        return count;
    }
}
