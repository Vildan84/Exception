package org.example;

public class WrongNumberException extends RuntimeException{

    private int len;

    public int getLen() {
        return len;
    }

    public WrongNumberException(int len){
        this.len = len;
    }
}
