package com.example.cards;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class standardDeck implements Deck{

    List<Card> cards;

    public standardDeck(){
        this.cards = newDeck();

    }

    private List<Card> newDeck() {
        List<Card> newDeck = new ArrayList<>();


        Arrays.stream(Suit.values());
                .ForEach(suit -> ({
                    Arrays.stream(FaceValue.values())
                            .map(faceValue -> new Card(suit, FaceValue))
                            .forEach(newDeck::add);
                });
        return newDeck;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public int search(Card card) {
        return this.cards.indexOf(card);
    }

    @Override
    public void newOrder(Deck card) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("standardDeck{");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}