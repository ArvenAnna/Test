package com.mainacad;
//too serious team
public class SimpleQueue implements Queue {
    public String[] getArrName() {
        return arrName;
    }

    private String[] arrName = new String[5];


    @Override
    public boolean add(String name){
        int i = 0;
        arrName[i]=name;
        System.out.println(arrName[i]);
        i++;
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
        return false;
    }
    @Override
    public boolean element(){
        return false;
    }
}

