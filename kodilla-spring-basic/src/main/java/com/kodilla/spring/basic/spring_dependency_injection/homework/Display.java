package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public String display(double value) {
        return "Result: " + value;
    }

    public String displayWarning() {
        return "Pamietaj cholero nie dziel przez ZERO !";
    }
}