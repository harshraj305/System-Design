package com.design.pattern.strategy.with.disease;

import com.design.pattern.strategy.with.treatment.TreatmentStrategy;

public class Disease {

    private int id;
    private String name;
    private String type;

    TreatmentStrategy treatmentStrategy;

    Disease(TreatmentStrategy treatmentStrategy) {
        this.treatmentStrategy = treatmentStrategy;
    }

    public void treat() {
        treatmentStrategy.treat();
    }

}
