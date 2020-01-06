package com.kodilla.stream.homework;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("test logon page", LocalDate.of(2019,12,1),
                LocalDate.of(2019,12,5)));
        tasks.add(new Task("report bugs", LocalDate.of(2019,12,10),
                LocalDate.of(2019,12,22)));
        tasks.add(new Task("drink coffee", LocalDate.of(2019,12,10),
                LocalDate.of(2019,12,15)));
        tasks.add(new Task("test documentation", LocalDate.of(2019,12,7),
                LocalDate.of(2019,12,8)));
        tasks.add(new Task("write test for sending email page", LocalDate.of(2019,12,
                9), LocalDate.of(2019,12,10)));
        return tasks;
    }
}