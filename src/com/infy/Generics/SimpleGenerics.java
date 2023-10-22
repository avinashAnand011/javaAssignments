package com.infy.Generics;

public class SimpleGenerics<Object> {

    Object obj;
    public SimpleGenerics(Object obj){
        this.obj=obj;
    }
    public void showObjectType() {
        System.out.println(obj.getClass().getTypeName());
    }

}
