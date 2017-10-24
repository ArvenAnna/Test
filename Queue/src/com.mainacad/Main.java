package com.mainacad;

public class Main {
    public static void main (String[] args){
        Queue queue= new SimpleQueue();

        queue.add("Masha");
        queue.add("Sasha");
        queue.add("Pasha");

        queue.remove();

        System.out.println(queue.element()); //"Sasha"

        System.out.println(queue.isEmpty()); //false

        queue.remove();
        queue.remove();
        System.out.println(queue.isEmpty());// true

    }
}
