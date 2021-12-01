package com.company;

import java.util.ArrayList;

public class Operation {
    ArrayList <Integer> intList = new ArrayList<>();
    String [] temp;
    String [] temp2;
    private String str;

    public Operation(String str) {
        this.str = str;
    }

    public String [] inPutString(){
        temp = str.split("");
        return temp;
    }

    public String [] inPutString1(){
        temp2 = str.replaceAll("\\D+", " ").split(" ");
        return temp2;
    }

    public int mathAction(String [] temp){
        int a = 0;
        for (String s : temp) {
                if (s.equals("+")) {
                    a = 1;
                    return a;
                } else if (s.equals("-")) {
                    a = 2;
                    return a;
                } else if (s.equals("*")) {
                    a = 3;
                    return a;
                } else if (s.equals("/")) {
                    a = 4;
                    return a;
                }
            }
        return a;
    }

    public ArrayList <Integer> onlyNumber(String [] temp){
        for(String string : temp){
            if(string.equals("+")||string.equals("-")||string.equals("*")||string.equals("/")||string.equals(" ")){
                continue;
            }
            Integer num = Integer.parseInt(string);
            intList.add(num);
        }
        return intList;
    }


}
