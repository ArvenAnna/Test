package com.mainacad;

class MyInitTestParent {

    MyInitTestParent() {
        System.out.println("constructor 1");
        System.out.println("constructor 2");
    }

    {
        System.out.println("non-static initialization block 1");
        System.out.println("non-static initialization block 2");
    }

    static {
        System.out.println("static initialization block 1");
        System.out.println("static initialization block 2");
    }

}
