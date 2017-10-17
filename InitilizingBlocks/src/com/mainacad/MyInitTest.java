package com.mainacad;

public class MyInitTest extends MyInitTestParent {
    private final int id;

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
