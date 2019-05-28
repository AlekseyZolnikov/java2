package it.intera.homework2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j) {
       super("Array[" + i + "]["+ j +"] Невозможно привести тип");
    }
}
