package org.example;

public class Task02 {

    /**
     * Не хватает дополнительных обработок для следующих исключений:
     * необходимо добавить catch если мы выйдем за пределы массива IndexOutOfBoundsException,
     * а также catch для NullPointerException если массив будет null
     */

    public static void task02() {
        try {
            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
