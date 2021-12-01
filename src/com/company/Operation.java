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

    public String [] inPutString(){ //разбиваем строку на элементы массива
        temp = str.split(""); // для опеределния какое мат. действие
        return temp;                // определил пользователь
    }

    public String [] inPutString1(){ // чистим введенную строку от не цифр и пробелов
        temp2 = str.replaceAll("\\D+", " ").split(" ");
        return temp2;
    }

    public int mathAction(String [] temp){ //определяем какой операнд ввел user
        int a = 0;
        for (String s : temp) {
            switch (s) {
                case "+" -> {
                    a = 1;
                }
                case "-" -> {
                    a = 2;
                }
                case "*" -> {
                    a = 3;
                }
                case "/" -> {
                    a = 4;
                }
            }
            }
        return a;
    }

    public ArrayList <Integer> onlyNumber(String [] temp){ //сонвертируем строки в цифры
        for(String string : temp){
            Integer num = Integer.parseInt(string);
            intList.add(num);
        }
        return intList;
    }


}
