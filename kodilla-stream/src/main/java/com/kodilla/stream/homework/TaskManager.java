package com.kodilla.stream.homework;

import lombok.extern.java.Log;

import java.time.LocalDate;
import java.util.List;

import static java.util.stream.Collectors.*;

@Log
public class TaskManager {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        try {
            List<LocalDate> dates = TaskRepository.getTask()
                    .stream()
                    .filter(deadline -> deadline.getDeadline().isAfter(currentDate))
                    .map(Task::getDeadline)
                    .collect(toList());
            if (dates.size() > 0)
                log.info("Dates of unfinished tasks: " + String.valueOf(dates));
            else
                log.info("All tasks finished.");
        } catch (Exception e) {
            log.info("Something went wrong :(.");
        } finally {
            log.info("Search completed.");
        }
    }
}