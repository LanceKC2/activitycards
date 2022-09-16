package com.example.cards;

import javax.naming.OperationNotSupportedException;

public interface Deck {
    void shuffle();
    void cut(int index);
    Card deal();
    Card turnOver();
    int search(Card card);
    void newOrder(Deck card);
    int size();

    default int newSize() throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }
}
