package com.mainacad;
//too serious team
public class SimpleQueue implements Queue {
    public String[] getArrName() {
        return arrName;
    }

    private String[] arrName = new String[5];

    public int i = 0;

    @Override
    public boolean add(String name){
        arrName[i]= name;
        this.i++;
        return true;
    }
    @Override
    public boolean remove(){

        arrName[0]= null;
        for(int a =1; a< arrName.length; a++ ){
            arrName[a-1]= arrName[a];
        }

        return false;
    }
    @Override
    public boolean isEmpty(){
        return arrName[0]==null;

    }
    @Override
    public String element(){
        return arrName[0];
    }
}

