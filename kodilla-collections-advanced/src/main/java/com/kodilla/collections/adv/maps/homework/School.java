package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Double> school = new ArrayList<>();

    public School(double... students) {
        for (double school : students)
            this.school.add(school);
    }

    public List<Double> getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }
}
