package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    public Person(String firstName, int age){
        this.firstName = firstName;
        this.age = age;
    }

    public void process(Job person) {
        System.out.println(firstName + " " + age + " " + person.jobResponsibilities());
    }
}
