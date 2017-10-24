package com.mainacad;

public class Main {
    public static void main (String[] args){
        SimpleQueue queue= new SimpleQueue();

        queue.add("Masha");
        queue.add("Sasha");
        queue.add("Pasha");

//        String [] arr2 =queue.getArrName();

        for(int a =0; a< 3; a++ ){
            System.out.println(queue.getArrName()[a]);

//            System.out.println(arr2[a]);
        }
        System.out.println(queue.getArrName());

        
        queue.remove();

        System.out.println(queue.element()); //"Sasha"

        System.out.println(queue.isEmpty()); //false

        queue.remove();
        queue.remove();
        System.out.println(queue.isEmpty());// true

    }
}
