package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Teacher 1")));
        students.add(new Student("Adam Nowak", null));
        students.add(new Student("Janina Kowalska", new Teacher("Teacher 2")));
        students.add(new Student("Ada Nowak", null));
        students.add(new Student("Janusz Kwiatkowski", new Teacher("Teacher 3")));
        students.add(new Student("Jan Kwiatkowski", null));

        students
                .stream()
                .map(Student::getTeacher)
                .forEach(un -> System.out.println("Uczeń: " + un.getName()));
    }
}

