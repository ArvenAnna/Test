package com.mainacad;

public class Main {
    public static void main(String[] args) {
        Queue queue = new SimpleStack();

        queue.add("Masha");
        queue.add("Sasha");
        queue.add("Pasha");

        System.out.println(queue.toString());
        System.out.println(queue.element());
        try {
            queue.remove();
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        queue.removeAll();
        System.out.println(queue.toString());


        //queue.reverseOrder(); /*Andrey Zhuravel comment: void reverseOrder method from AbstractQueue class*/

//        queue.remove();
//        queue.remove();
//        queue.remove();

//        System.out.println(queue.element()); //"Sasha"
//
//        for (int a = 0; a < queue.getArrName().length; a++) {
//            System.out.println(queue.getArrName()[a]);
//        }
//
//        System.out.println(queue.isEmpty()); //false
//
//        queue.remove();
//        queue.remove();
//
//        System.out.println(queue.isEmpty());// true

    }
}
