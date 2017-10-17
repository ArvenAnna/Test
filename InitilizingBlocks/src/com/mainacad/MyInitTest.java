package com.mainacad;

public class MyInitTest extends MyInitTestParent {
    private final int id;
    public static int height1;
    public static int weight1;
    private int height;
    private int weight;

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
        this(30);
        height = 30;
        System.out.println("constructor 2");


    }

    public MyInitTest(int height) {
        this.height = height;
        System.out.println("constructor 1");
    }

    public int getId() {
        return id;
    }

    MyInitTest(int id) {
        this.id = id;
    }
    private final double[] arr = new double[5];
    {
        for(int i = 0; i < 5; i++){
            arr[i] = Math.random() * 100;
        }
    }

    public void printArray(){
        for(int b = 0; b < 5; b++){
            System.out.println(arr[b]);
        }
    }
}
