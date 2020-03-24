package com.michalkarolinadarek.apps.cards;

import java.util.Comparator;

public class CardPainfulnessComparator implements Comparator<Card>{

    @Override
    public int compare(Card card1, Card card2) {
        int result = card1.getPainfulness() - card2.getPainfulness();
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    } 
}