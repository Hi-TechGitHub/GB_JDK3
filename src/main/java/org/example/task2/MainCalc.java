package org.example.task2;

public class MainCalc {
    public static void main(String[] args) {
        int num1 = 5;
        float num2 = 10;
        System.out.println(num1 + " + " + num2 + " = " + Calculator.sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + Calculator.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Calculator.divide(num1, num2));
    }
}