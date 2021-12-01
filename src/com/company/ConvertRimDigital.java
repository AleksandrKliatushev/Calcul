package com.company;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class ConvertRimDigital {

    final String ONE = "I";
    final String TWO = "II";
    final String THREE = "III";
    final String FOUR = "IV";
    final String FIVE = "V";
    final String SIX = "VI";
    final String SEVEN = "VII";
    final String EIGHT = "VIII";
    final String NINE = "IX";
    final String TEN = "X";
    final String str;

    public ConvertRimDigital(String str) {
        this.str = str;
    }

    public ArrayList <Integer> convert (String str){

        ArrayList <Integer> arrayList = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\W");
        String [] temp = pattern.split(str);
        for(String s : temp){
            arrayList.add(one(s));
        }

        return arrayList;
    }



    public int one(String str) { //переопределяем римские цифры в арабские
        int a = switch (str) {
            case ONE -> 1;
            case TWO -> 2;
            case THREE -> 3;
            case FOUR -> 4;
            case FIVE -> 5;
            case SIX -> 6;
            case SEVEN -> 7;
            case EIGHT -> 8;
            case NINE -> 9;
            case TEN -> 10;
            default -> 0;
        };
        return a;
    }


}
