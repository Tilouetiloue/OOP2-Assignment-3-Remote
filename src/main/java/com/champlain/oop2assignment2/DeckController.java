package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.Comparator;

public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    @FXML
    private TextArea aHandTextArea;

    @FXML
    private Label aScoreLabel;

    private final Deck aDeck = new Deck();

    private final Hand aHand = new Hand();

    private final Comparator<Card> sortingStrategy = new FirstRankComparator();

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

    @FXML
    protected void onScoreButtonClick() {
        aScoreLabel.setText("Not implemented.");
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

}