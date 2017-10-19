package com.mainacad;

public class Main {
    public static void main(String[] args) {
        MyInitTest mit = new MyInitTest();
        MyInitTest newobject = new MyInitTest(1);
        MyInitTest obj = new MyInitTest(50);
        MyInitTest obj2 = new MyInitTest(30);
        System.out.println(obj.getId());
        System.out.println(obj2.getId());
        MyInitTest test = new MyInitTest(10);
        test.printArray();
    }
}