package com.kodilla.abstracts.homework;

public class ApplicationJob {
    public static void main(String[] args) {
        Job hydraulik = new Hydraulik();

        Person processorHydraulik = new Person("Jan", 50, "Hydraulik");
        processorHydraulik.process(hydraulik);

        Job drwal = new Drwal();

        Person processorDrwal = new Person("Tadeusz", 20, "Drwal");
        processorDrwal.process(drwal);

        Job elektryk = new Elektryk();

        Person processorElektryk = new Person("Kazimierz", 30, "Elektryk");
        processorElektryk.process(elektryk);
    }
}
