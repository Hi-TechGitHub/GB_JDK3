package org.example.exceptionsForHW;

public class ArraysSizeException extends RuntimeException  {
    public ArraysSizeException() {
        super("Длины массивов не равны");
    }
}
