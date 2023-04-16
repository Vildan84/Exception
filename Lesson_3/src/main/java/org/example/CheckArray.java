package org.example;

import java.util.HashMap;

public class CheckArray {

    private String[] array;

    public CheckArray(String[] arr){
        this.array = arr;
    }

    public HashMap<String, String> checkItems(){
        HashMap<String, String> map = new HashMap<>();
        String name = "";

        if (array.length != 6){
            throw new WrongNumberException(array.length);
        }
        else {
            for (String str: array){
                if (str.equals("m") || str.equals("f")){
                    map.put("Пол", str);
                }
                else if (str.matches("[0-3][0-9]\\.[0-1][0-9]\\.[0-9]{4}")){
                    map.put("Дата рождения", str);
                }
                else if (str.matches("[0-9]{11}")){
                    map.put("Телефон", str);
                }
                else if (str.matches("[А-Яа-я]*") || str.matches("[A-Za-z]*")){
                    name += str + " ";
                }
            }
            map.put("ФИО", name);

            return map;
        }

    }
}
