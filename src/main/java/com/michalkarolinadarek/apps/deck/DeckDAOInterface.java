package com.michalkarolinadarek.apps.deck;

import java.util.List;

import com.michalkarolinadarek.apps.cards.Card;

public interface DeckDAOInterface {

     List<Card> getDeck();

     Card getCard(int index);

     void updateDeck(List<Card> deck);

     void updateCard(Card card, int index);

     void deleteCard(Card card);

     void deleteCard(int index);

     void deleteDeck();

     void addCard(Card card);
}
