package com.design.pattern.strategy.with.disease;

import com.design.pattern.strategy.with.treatment.Basic;
import com.design.pattern.strategy.with.treatment.TreatmentStrategy;

public class JointPain extends Disease {


    public JointPain() {
        super(new Basic());
    }
}
