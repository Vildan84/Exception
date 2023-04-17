package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteToFile {

    private String path;

    public WriteToFile (String path){
        this.path = path;
    }
    public void write(HashMap<String, String> map) throws IOException{
        String lastname = StringToArray.toArray(map.get("ФИО"))[0];
        FileWriter writer = new FileWriter(path + lastname + ".txt", true);
        String[] items = map.values().toArray(new String[0]);
        String textToWrite = "";

        for (String str: items){
            textToWrite += str + " ";
        }
        writer.write(textToWrite + "\n");
        writer.close();
    }
}
