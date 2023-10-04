package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.List;


public class SimpleCountStrategy implements ScoringStrategy {
    @Override
    public int calculateScore(List<Card> plist) {
        int count = 0;

        for (Card card : plist) {
            count++;
        }
        return count;
    }
}
