package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumResult = calculator.addingNumbers();
        boolean correct1 = ResultChecker.assertEquals(13, sumResult);
        if (correct1) {
            System.out.println("Metoda sum działa poprawnie dla liczb");
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb");
        }
        int substractResult = calculator.subtractionNumbers();
        boolean correct = ResultChecker.assertEquals(3, substractResult);
        if (correct) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb");
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb");
        }
    }
}
