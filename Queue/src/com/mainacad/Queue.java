package com.mainacad;

public interface Queue {
    boolean add(String name);

    boolean remove() throws MyException ;

    boolean isEmpty();

    String element();

    void reverseOrder();

    void removeAll();


    void shuffle();
}
