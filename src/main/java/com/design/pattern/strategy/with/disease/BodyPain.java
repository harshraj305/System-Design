package com.design.pattern.strategy.with.disease;

import com.design.pattern.strategy.with.treatment.Basic;

public class BodyPain extends Disease {

    public BodyPain () {
        super(new Basic());
    }
}
