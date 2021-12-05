package com.company.action;

public class Delitel extends Action{
    private final Integer a;
    private final Integer b;
    public Delitel (Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }


    public Integer operation(){
        return a / b;
    }
}
