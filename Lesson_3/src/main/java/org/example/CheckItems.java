package org.example;

import java.util.HashMap;

public class CheckItems {

    public void checkItems(HashMap<String, String> map){
        String[] name = StringToArray.toArray(map.get("ФИО"));
        if (name.length != 3){
            throw new WrongInputException("ФИО");
        }
        String[] keys = new String[]{"ФИО", "Пол", "Телефон", "Дата рождения"};
        for (String key: keys){
            if (!map.containsKey(key)){
                throw new WrongInputException(key);
            }
        }
    }
}
