package it.intera.homework2;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Wrong Array Size");
    }
    public MyArraySizeException(int i) {
        super("Wrong Array Size in Array["+i+"]");
    }
}
