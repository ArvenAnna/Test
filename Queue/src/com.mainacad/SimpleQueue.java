package com.mainacad;
//too serious team
public class SimpleQueue implements Queue {
    private String[] arrName = new String[2];

    @Override
    public boolean add(String name){
        int i = 0;
        arrName[i]=name;
        i++;
        return true;
    }
    @Override
    public boolean remove(){
        return false;
    }
    @Override
    public boolean isEmpty(){
        return false;
    }
    @Override
    public boolean element(){
        return false;
    }
}

