package com.company;
import com.company.converter.ArabicDigital;
import com.company.converter.RimDigital1;


import java.util.Scanner;

public class Executable {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InPutData inPutData = new InPutData();
        while(true) {
            System.out.println("Запустить калькулятор?\n Нажми 1");
            System.out.println(" Выход 0");
            int num = scanner.nextInt();
            if(num == 1) {
                System.out.println("Какие цифры вы хотели бы использовать");
                System.out.println("арабские - 1");
                System.out.println("римские  - 2");
                num = scanner.nextInt();
                if(num == 1) {
                    System.out.println("Введите то, что вы хотели вычислить");
                    ArabicDigital arabicDigital = new ArabicDigital(InPutData.inPutData());
                    System.out.println(arabicDigital.digital());
                } else if (num == 2){
                    System.out.println("Введите то, что вы хотели вычислить");
                    RimDigital1 rimDigital1 = new RimDigital1(InPutData.inPutData());
                    System.out.println(rimDigital1.digital());
                } else {
                    System.out.println("Вы ввели недопустимые значения");
                }
            } else if (num == 0){
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Вы ввели неправильное значение, повторите попытку");
            }
        }

    }
}
