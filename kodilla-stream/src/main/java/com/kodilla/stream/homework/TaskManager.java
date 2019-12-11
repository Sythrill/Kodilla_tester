package com.kodilla.stream.homework;
import lombok.extern.java.Log;
import java.time.LocalDate;
import java.util.List;
import static java.util.stream.Collectors.*;

@Log
public class TaskManager {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> dates = TaskRepository.getTask()
                .stream()
                .filter(deadline -> deadline.getDeadline().isAfter(currentDate))
                .map(Task::getDeadline)
                .collect(toList());
        log.info(String.valueOf(dates));
    }
}