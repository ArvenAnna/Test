package com.mainacad;

public class MyInitTest extends MyInitTestParent {
    private final int id;
    public final static int height1;
    public final static int weight1;
    private final int height;
    private final int weight;

    static {
        height1 = 14;
        System.out.println("static initialization block 1");
    }

    static {
        weight1 = 28;
        System.out.println("static initialization block 2");
    }

    {
        height = 15;
        System.out.println("non-static initialization block 1");
    }

    {
        weight = 29;
        System.out.println("non-static initialization block 2");
    }


    public MyInitTest() {
        System.out.println("constructor 2");
        id = 0;
    }

    MyInitTest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    private final double[] arr = new double[5];

    {
        for (int i = 0; i < 5; i++) {
            arr[i] = Math.random() * 100;
        }
    }

    public void printArray() {
        for (int b = 0; b < 5; b++) {
            System.out.println(arr[b]);
        }
    }
}
