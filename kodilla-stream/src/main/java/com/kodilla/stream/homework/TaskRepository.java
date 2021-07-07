package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Zadanie 1", LocalDate.of(2019, 1, 20), LocalDate.of(2019, 1, 21)));
        tasks.add(new Task("Zadanie 2", LocalDate.of(2020, 2, 20), LocalDate.of(2020, 2, 21)));
        tasks.add(new Task("Zadanie 3", LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 21)));
        tasks.add(new Task("Zadanie 4", LocalDate.of(2022, 4, 20), LocalDate.of(2022, 4, 21)));
        tasks.add(new Task("Zadanie 5", LocalDate.of(2023, 5, 20), LocalDate.of(2023, 5, 21)));
        tasks.add(new Task("Zadanie 6", LocalDate.of(2024, 6, 20), LocalDate.of(2024, 6, 21)));
        return tasks;
    }
}
