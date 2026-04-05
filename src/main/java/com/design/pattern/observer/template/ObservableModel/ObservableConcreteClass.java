package com.design.pattern.observer.template.ObservableModel;

import com.design.pattern.observer.template.ObservedModel.Observed;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcreteClass implements Observable {

    List<Observed> obs = new ArrayList<>();
    int value = 0;

    public ObservableConcreteClass(List<Observed> obs) {
        this.obs = obs;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void adds(Observed newObs) {
        obs.add(newObs);
    }

    @Override
    public void remove(Observed preObs) {
        obs.remove(preObs);
    }

    @Override
    public void notifies() {
        for (Observed o : obs) {
            o.update();
        }
    }

    @Override
    public void setValue(Object newValue) {
        // if newVal != preVal then --->
        value = (int)newValue;
    }
}
