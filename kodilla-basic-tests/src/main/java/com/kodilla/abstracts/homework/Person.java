package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void process() {
        System.out.println(firstName + " " + age);
    }

    public void showResponsibilities(){
        System.out.println(firstName + " " + age + " " + job.job);
        System.out.println(job.responsibilities);
    }
}
