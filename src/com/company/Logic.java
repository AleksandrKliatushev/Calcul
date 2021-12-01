package com.company;


import java.util.ArrayList;
import java.util.Scanner;


public class Logic {
    Scanner sc = new Scanner(System.in);                // опередляем ввод с клавиатуры
    SetNumber setNumber = new SetNumber(sc.nextLine()); // передаём введенную информацию ввиде строки
    String str = setNumber.getString();
    Operation operation = new Operation(str);
    int a = 0;



    public Calculation rez(){
               //передаём введенную строку в класс Operation
        String []  temp = operation.inPutString();          // для определения действия разбиваем строку на символы и помещаем её в массив
        a = operation.mathAction(temp);                 // определяем какой математический знак ввел пользователь
        ArrayList<Integer> num = operation.onlyNumber(operation.inPutString1()); // получаем перечисление цифр
        Calculation calculation = new Calculation(num);
        return calculation;
    }



    public void logic(Calculation calculation){                                //совершаем математическую операцию
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
