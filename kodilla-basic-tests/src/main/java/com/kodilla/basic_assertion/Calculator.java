package com.kodilla.basic_assertion;

import java.util.Scanner;


public class Calculator {
    private static int a;
    private static int b;


    public Calculator() {

        this.a = 8;
        this.b = 5;
    }

    public static int addingNumbers() {
        int result;
        result = a + b;
        return result;

    }
    public static int subtractionNumbers(){
        int result;
        result = a - b;
        return result;
    }
    public static int squareNumbers(){
        int result;
        result = a * a;
        return result;
    }
}
