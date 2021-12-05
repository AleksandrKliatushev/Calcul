package com.company.action;

public class Plus extends Action{
    private final Integer a;
    private final Integer b;
    public Plus(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    public Integer operation(){
    return a + b;
    }
}
