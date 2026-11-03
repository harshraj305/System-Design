package com.design.pattern.strategy.with;

import com.design.pattern.strategy.with.disease.BodyPain;
import com.design.pattern.strategy.with.disease.Disease;
import com.design.pattern.strategy.with.disease.Fracture;
import com.design.pattern.strategy.with.disease.JointPain;
import com.design.pattern.strategy.with.treatment.Basic;
import com.design.pattern.strategy.with.treatment.TreatmentStrategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("************************");

        Disease bodyPain = new BodyPain();
        bodyPain.treat();

        Disease jointPain = new JointPain();
        jointPain.treat();

        Disease fracture = new Fracture();
        fracture.treat();

    }
}