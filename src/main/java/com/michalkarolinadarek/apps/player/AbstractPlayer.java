package com.michalkarolinadarek.apps.player;

import java.util.ArrayList;

import com.michalkarolinadarek.apps.cards.Card;

public abstract class AbstractPlayer {
    protected Hand hand;
    protected UsedPile usedPile;

    public abstract void setCardToHand(ArrayList<Card> cardForPlayer);

    public abstract void takeWonCard(Card card);

    public abstract Card getTopCard();

    public abstract int getUsedPileCount();

    public abstract String getName();
}
