package com.michalkarolinadarek.apps.player;

import java.util.ArrayList;
import java.util.List;
import com.michalkarolinadarek.apps.cards.Card;

class Hand {
    private List<Card> cardsToUse;

    Hand(){
        cardsToUse = new ArrayList<>();
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
