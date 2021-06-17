package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal jan = new Principal("Jan", "Kowalski", "Jedynka");
        Principal adam = new Principal("Adam", "Nowak", "Dwójka");
        Principal janina = new Principal("Janina", "Kowalska", "Trójka");

        School janSchool = new School(500);
        School adamSchool = new School(200);
        School janinaSchool = new School(800);

        school.put(jan, janSchool);
        school.put(adam, adamSchool);
        school.put(janina, janinaSchool);

            for (Map.Entry<Principal, School> schoolEntry : school.entrySet())
                System.out.println("Imię i nazwisko dyrektora: " + schoolEntry.getKey().getFirstname() + " " + schoolEntry.getKey().getLastname() + ", szkoła: " + schoolEntry.getKey().getSchoolName() + ", ucznów w szkole: " +
                        schoolEntry.getValue().getSchool());
    }
}
