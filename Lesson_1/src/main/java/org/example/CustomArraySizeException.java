package org.example;

public class CustomArraySizeException extends RuntimeException {

    private int len1;
    private int len2;

    public int getLen1() {
        return len1;
    }

    public int getLen2() {
        return len2;
    }

    public CustomArraySizeException(String message, int len1, int len2){
        super(message);
        this.len1 = len1;
        this.len2 = len2;
    }

}
