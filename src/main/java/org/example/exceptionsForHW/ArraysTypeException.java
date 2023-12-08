package org.example.exceptionsForHW;


public class ArraysTypeException extends RuntimeException {

    public ArraysTypeException() {
        super("Типы массивов отличаются");
    }
}
