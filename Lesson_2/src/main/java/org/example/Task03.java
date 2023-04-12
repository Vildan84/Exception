package org.example;

import java.io.FileNotFoundException;

public class Task03 {

    public static void task03(){  // убираем throws Exception, пробрасывать исключения далее не нужно, здесь надо их обрабатывать
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b); // добавим ArithmeticException для этого действия, если b окажется нулем
            printSum(23, 234); // этот метод требует добавить catch для FileNotFoundException
            int[] abc = { 1, 2 };
            abc[3] = 9;
//        } catch (Throwable ex) {  // этот catch не нужен, он обрабатывает все ошибки и исключения и будет не понятно, что пошло не так
//            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex){
            System.out.println("На ноль делить нельзя");
        } catch (FileNotFoundException ex){
            System.out.println("Данные не найдены");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
