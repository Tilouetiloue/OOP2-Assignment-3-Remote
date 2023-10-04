package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    @FXML
    private TextArea aHandTextArea;

    @FXML
    private Label aScoreLabel;

    private final Deck aDeck = new Deck();

    private final Hand aHand = new Hand();

    private Comparator<Card> sortingStrategy = new FirstRankComparator();

    private Comparator<Card>  suitSortingStrategy = new SuitFirstComparator();

    private SimpleCountStrategy simpleCount = new SimpleCountStrategy();

    public void initialize() {
        this.displayCardCollections();
    }

    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayCardCollections();
    }

    // Feature1
    @FXML
    protected void onSortButtonClick() {
        aDeck.sort(sortingStrategy);
        this.displayCardCollections();
    }

    // Feature2
    @FXML
    protected void onSortBySuitButtonClick() {
        aDeck.sortSuit(suitSortingStrategy);
        this.displayCardCollections();
    }


    @FXML
    protected void onScoreButtonClick() {
        List<Card> pHand = new ArrayList<>();
        int score;
        for (Card card : aHand) {
            pHand.add(card);
        }
        score = simpleCount.calculateScore(pHand);
        displayScore(score);
    }
    @FXML
    protected void onAceButtonClick() {
        
    }

    @FXML
    protected void onDrawButtonClick() {
        if (!this.aDeck.isEmpty()) {
            this.aHand.addCard(aDeck.draw());
        }
        this.displayCardCollections();
    }

    private void displayCardCollections () {
        this.aDeckTextArea.setText(this.aDeck.toString());
        this.aHandTextArea.setText(this.aHand.toString());
    }
    private void displayScore (int score) {
        aScoreLabel.setText(Integer.toString(score));
    }
}