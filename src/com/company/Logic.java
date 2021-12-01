package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
    Scanner sc = new Scanner(System.in);
    SetNumber setNumber = new SetNumber(sc.nextLine());
    String str = setNumber.getString();
    Operation operation = new Operation(str);
    String []  temp = operation.inPutString();
    int a = operation.mathAction(temp);
    ArrayList<Integer> num = operation.onlyNumber(operation.inPutString1());
    Calculation calculation = new Calculation(num);

    public void logic(){
        if (a == 1){
            calculation.plus();
        } else if (a == 2) {
            calculation.minus();
        } else if (a == 3){
            calculation.multi();
        } else {
            calculation.divide();
        }
    }


}
