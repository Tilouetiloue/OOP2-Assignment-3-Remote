package com.champlain.oop2assignment2;

import java.util.*;

public class Deck extends CardCollection implements CardSource {
    private final List<Card> aCards = new ArrayList<Card>();

    public Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    public Card draw() {
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    // Feature1
    public void sort(Comparator<Card> sortingStrategy) {
        aCards.sort(sortingStrategy);
    }

    // Feature2
    public void sortSuit(Comparator<Card> sortingStrategy) {
        aCards.sort(sortingStrategy);
    }
}
