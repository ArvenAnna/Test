package com.mainacad;

enum NotMetall{

    C(6),
    H(1);

    private int elecrtonegatyvity;

    private NotMetall(int elecrtonegatyvity) {
        this.elecrtonegatyvity = elecrtonegatyvity;
    }

    public int getElecrtonegatyvity() {
        return elecrtonegatyvity;
    }
}
