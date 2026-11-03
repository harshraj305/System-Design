package com.design.pattern;

import com.design.pattern.strategy.without.disease.BodyPain;
import com.design.pattern.strategy.without.disease.JointPain;
import com.design.pattern.strategy.without.disease.Fracture;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("************************");

        BodyPain bodyPain = new BodyPain();
        bodyPain.treatmentType();

        JointPain jointPain = new JointPain();
        jointPain.treatmentType();

        Fracture fracture = new Fracture();
        fracture.treatmentType();

    }
}