package com.design.pattern.strategy.without;

import com.design.pattern.strategy.without.disease.BodyPain;
import com.design.pattern.strategy.without.disease.Fracture;
import com.design.pattern.strategy.without.disease.JointPain;

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