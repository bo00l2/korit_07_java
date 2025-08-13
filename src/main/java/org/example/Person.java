package org.example;

import lombok.*;

@Builder
@Data
public class Person {
    private String name;
    private double height;
    private double weight;
}