package org.example.exceptionsForHW;

public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("На ноль делить нельзя");
    }

}