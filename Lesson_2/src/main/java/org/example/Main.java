package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        getFloat();

    }


    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    public static void getFloat(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        try {
            double number = scan.nextFloat();
            System.out.println(number);
            System.out.println("Вывод завершен!");
            scan.close();
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод, попробуйте еще раз");
            getFloat();
        }

    }


}