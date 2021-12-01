package com.company_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var processor = new Processor();
        while(true) {
            System.out.println("Запустить калькулятор?\n Нажми 1");
            System.out.println(" Выход 0");
            int num = scanner.nextInt();

            if(num == 1) {
                System.out.println("Введите то, что вы хотели вычислить");
                var expression = scanner.nextLine();
                var action = processor.chooseAction(expression);
                int result = processor.applyAction(expression, action);

                System.out.println(result);

            } else if (num == 0){
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Вы ввели неправильное значение, повторите попытку");
            }
        }
    }
}
