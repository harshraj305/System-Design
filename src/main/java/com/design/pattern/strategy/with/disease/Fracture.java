package com.design.pattern.strategy.with.disease;

import com.design.pattern.strategy.with.treatment.Advanced;

public class Fracture extends Disease {

    public Fracture() {
        super (new Advanced());
    }

}
