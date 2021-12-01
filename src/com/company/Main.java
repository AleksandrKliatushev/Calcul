package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Запустить калькулятор?\n Нажми 1");
            System.out.println(" Выход 0");
            int num = scanner.nextInt();

            if(num == 1) {
                System.out.println("Введите то, что вы хотели вычислить");
                Logic myCalculator = new Logic();
                myCalculator.logic();
            } else if (num == 0){
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Вы ввели неправильное значение, повторите попытку");
            }
        }
    }
}
