package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope("prototype")
public class Clock {

    public Clock() {
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
    }

    @Override
    public String toString() {
        return "Clock{}";
    }
}
