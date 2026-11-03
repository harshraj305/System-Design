package com.design.pattern.strategy.with.treatment;

public class Advanced implements TreatmentStrategy {

    private int id;
    private String name;
    private String type;

    public void treat() {
        System.out.println("Treatment type for disease is: Advanced Treatment");
    }
}
