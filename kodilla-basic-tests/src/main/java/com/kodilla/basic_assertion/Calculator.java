package com.kodilla.basic_assertion;

import java.util.Scanner;


public class Calculator {
    private static int a;
    private static int b;
    public static int getNumberA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 8:");
        int A = scanner.nextInt();
        return A;
    }
    public static int getNumberB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 5:");
        int B = scanner.nextInt();
        return B;
    }

    public Calculator() {

        this.a = getNumberA();
        this.b = getNumberB();
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

}
