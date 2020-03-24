package com.michalkarolinadarek.apps.player;

import java.util.ArrayList;
import java.util.List;

import com.michalkarolinadarek.apps.cards.Card;

class UsedPile{
    private List<Card> usedCards;

    UsedPile(){
        usedCards = new ArrayList<Card>();
    }

    void addToUsedPile(Card newCard){
        usedCards.add(newCard);
    }

    int getCount(){
        return usedCards.size();
    }
}