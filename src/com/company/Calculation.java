package com.company;

import java.util.ArrayList;

public class Calculation {
    private int a;
    private int b;

    public Calculation(ArrayList<Integer> intArrayList) {
        for (int k : intArrayList) {
            this.a = intArrayList.get(0);
            this.b = intArrayList.get(1);
        }
    }

    public void Plus() {
        System.out.println(a + b);
    }

    public void Minus() {
        System.out.println(a - b);
    }

    public void Multi() {
        System.out.println(a * b);
    }

    public void Delit() {
        System.out.println(a / b);
    }

}
