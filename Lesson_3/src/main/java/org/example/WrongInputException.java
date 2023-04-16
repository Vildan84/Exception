package org.example;

public class WrongInputException extends RuntimeException{

    private String item;

    public String getItem() {
        return item;
    }

    public WrongInputException(String item){
        this.item = item;
    }

}
