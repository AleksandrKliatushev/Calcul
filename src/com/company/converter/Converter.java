package com.company.converter;

import com.company.action.*;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Converter {
    private static String s;
    public Converter(String s) {
        this.s = s;
    }

    public static String getS() {
        return s;
    }

    public void setS(String s) {
        Converter.s = s;
    }

    public abstract Integer digital();

    public String operand(){

        var temp = getS().split("");
        String rez="";
        for(String str: temp) {
            if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")){
                rez = str;
            }
        }
        return rez;
    }

    public Integer result (int a, int b){
        Action plus = new Plus(a,b);
        Action minus = new Minus(a,b);
        Action multiplex = new Multiplex(a,b);
        Action delitel = new Delitel(a,b);


        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("+", plus.operation());
        maps.put("-", minus.operation());
        maps.put("*", multiplex.operation());
        maps.put("/", delitel.operation());

        if(maps.containsKey(operand())){
            a = maps.get(operand());
        }
        return a;
    }

}
