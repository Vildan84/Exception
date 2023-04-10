package org.example;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class ArrayNumbersRes {


    public int[] ResidualArrayNumbers(int[] arr1, int[] arr2){

        if (arr1 == null || arr2 == null){
            throw new NullPointerException("Error: One off arrays doesn't exist");
        }

        if (arr1.length != arr2.length){
            throw new CustomArraySizeException("Error: Arrays length must be equal", arr1.length, arr2.length);
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

}
