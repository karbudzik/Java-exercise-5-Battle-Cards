package com.michalkarolinadarek.apps.cards;

import java.util.Comparator;

public class CardInfectvityComparator implements Comparator<Card>{

    @Override
    public int compare(Card card1, Card card2) {
        int result = card1.getInfectvity() - card2.getInfectvity();
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}