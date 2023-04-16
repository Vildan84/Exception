package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class View {

    public void view(){
        String path = "home/vildan/Documents/";
        Scanner scan = new Scanner(System.in);
        WriteToFile writeToFile = new WriteToFile(path);
        CheckItems items = new CheckItems();
        System.out.println("Введите данные по образцу (допускается ввод в произволном порядке)\n" +
                "Иванов Иван Иванович f/m 89184445577 01.01.2000:  ");
        String text = scan.nextLine();
        String[] arr = StringToArray.toArray(text);
        CheckArray check = new CheckArray(arr);
        try{
            HashMap<String,String> map = check.checkItems();
            items.checkItems(map);
            writeToFile.write(map);

        } catch (WrongNumberException e){
            System.out.printf("Неверное количество введенных данных, введено %d данных из шести\n", e.getLen());
            view();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            view();
        } catch (WrongInputException e){
            System.out.printf("Неверные данные при вводе: %s\n", e.getItem());
            view();
        }
        scan.close();
    }
}
