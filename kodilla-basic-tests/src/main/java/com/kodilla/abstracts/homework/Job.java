package com.kodilla.abstracts.homework;

public abstract class Job {

    int salary;
    String responsibilities;
    String job;

    public Job(int salary, String responsibilities, String job) {

        this.salary = salary;
        this.responsibilities = responsibilities;
        this.job = job;
    }

    //public String showResponsibilities() {
    //    return responsibilities;
    //}
    //public String jobTitle() {
    //    return job;
}
