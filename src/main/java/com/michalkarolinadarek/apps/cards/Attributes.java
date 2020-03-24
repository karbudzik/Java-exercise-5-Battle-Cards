package com.michalkarolinadarek.apps.cards;

enum Attributes {
    
    INFECTIVITY(2), DEATHS(3), INCUBATION(4), PAINFULNESS(5), PANIC_LEVEL(6);

    private int index;

    Attributes(int index) {
        this.index = index; 
    } 

    public int getIndex() {
        return index;
    }
} 