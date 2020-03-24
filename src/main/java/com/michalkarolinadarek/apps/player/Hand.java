package com.michalkarolinadarek.apps.player;

import java.util.ArrayList;
import java.util.List;
import com.michalkarolinadarek.apps.cards.Card;

class Hand {
    private List<Card> cardsToUse;
    private UsedPile usedPileCards;

    Hand(UsedPile usedPile){
        cardsToUse = new ArrayList<Card>();
        usedPileCards = usedPile;
    }


    void moveToUsedPile(com.michalkarolinadarek.apps.cards.Card card){
        usedPileCards.addToUsedPile(card);
    }

    Card removeCard(){
        Card returnCard = cardsToUse.get(0);
        cardsToUse.remove(returnCard);
        return returnCard;
    }

    void setListOfCards(List<Card> newListOfCard){
        cardsToUse = newListOfCard;
    }
}
