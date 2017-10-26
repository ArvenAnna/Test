package com.mainacad;

public interface Queue {
    boolean add(String name);

    boolean remove();

    boolean isEmpty();

    String element();

    void reverseOrder();
}
