package org.example;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class ArrayNumbersDivide {

    public double[] DivideArrayNumbers(int[] arr1, int[] arr2){

        if (arr1 == null || arr2 == null){
            throw new NullPointerException("Error: One off arrays doesn't exist");
        }

        if (arr1.length != arr2.length){
            throw new CustomArraySizeException("Error: Arrays length must be equal", arr1.length, arr2.length);
        }

        for (int j : arr2) {
            if (j == 0) {
                throw new ArithmeticException("Error: Can't divide by zero");
            }
        }
        double[] result = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i] = Math.round((double) arr1[i] / arr2[i]);
        }
        return result;
    }
}
