package com.kodilla.abstracts.homework;

public class ApplicationJob {
    public static void main(String[] args) {


        Person hydraulik = new Person("Jan", 50, new Hydraulik());
        hydraulik.showResponsibilities();

        Person drwal = new Person("Kazio", 60, new Drwal());
        drwal.showResponsibilities();

        Person elektryk = new Person("Tadzio", 70, new Elektryk());
        elektryk.showResponsibilities();
}

}
