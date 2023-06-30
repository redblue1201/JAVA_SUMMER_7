package com.java.ex.data;

public class Child extends Parent{
    public Child(){
        super();
    }
    public void getName(){
        System.out.println("내 이름 : 강해린");
    }
    @Override
    public void hobby(){
        System.out.println("취미 : 야구보기");
    }

}
