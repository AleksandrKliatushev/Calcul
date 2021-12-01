package com.company;

import java.util.ArrayList;

public class Calculation {
    private int a;
    private int b;

    public Calculation(ArrayList<Integer> intArrayList) {
        for (int k : intArrayList) {
            this.a = intArrayList.get(0); //получаем на вход значение переменных
            this.b = intArrayList.get(1);
        }
    }

    public void plus() {               //производим действия
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }

    public void multi() {
        System.out.println(a * b);
    }

    public void divide() {
        System.out.println(a / b);
    }

}
