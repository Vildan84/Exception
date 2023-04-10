package org.example;

import java.util.Arrays;
import java.util.Random;


public class Main {
        static Random random = new Random();

    public static void main(String[] args) {
//        task1();
        task2();

    }

    static void task1 (){   //Создаем первое задание с вероятным выпадением Exception
        int[] arr1 = create_array();
        int[] arr2 = create_array();
        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));
        ArrayNumbersRes anr = new ArrayNumbersRes();

        try{
            int[] result = anr.ResidualArrayNumbers(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (CustomArraySizeException e){
            System.out.println(e.getMessage());
            System.out.printf("Длина первого массива: %d, длина второго массива: %d", e.getLen1(), e.getLen2());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

    static void task2 (){   //Создаем второе задание с вероятным выпадением Exception
        int[] arr1 = create_array();
        int[] arr2 = create_array();
        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));
        ArrayNumbersDivide and = new ArrayNumbersDivide();

        try{
            double[] result = and.DivideArrayNumbers(arr1, arr2);
            System.out.println("Result array: " + Arrays.toString(result));
        } catch (CustomArraySizeException | NullPointerException | ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }

    static int[] create_array(){
        int arrayLen = random.nextInt(7, 9); //Создаем массив разной длинны
        int[] arr = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++){
            arr[i] = random.nextInt(20); //Наполняем массив случайными числами
        }
        if(random.nextInt(10) == 1){   //Обнуляем массив случайным образом для вызова NullPointerException
            arr = null;
        }

        return arr;
    }






}