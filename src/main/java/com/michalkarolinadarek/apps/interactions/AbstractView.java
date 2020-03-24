package com.michalkarolinadarek.apps.interactions;

import com.michalkarolinadarek.apps.cards.Card;

public abstract class AbstractView {
    public abstract void print(String message);

    public abstract void print(Card card);

    public abstract void print(Card card1, Card card2);

    public abstract void print(String[] list, String title);
}