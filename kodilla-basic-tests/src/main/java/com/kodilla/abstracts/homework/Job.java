package com.kodilla.abstracts.homework;

public abstract class Job {

    int salary;
    String responsibilities;

    public Job(int salary, String responsibilities) {

        this.salary = salary;
        this.responsibilities = responsibilities;
    }
    public String jobResponsibilities() {
        return responsibilities;
    }
}
