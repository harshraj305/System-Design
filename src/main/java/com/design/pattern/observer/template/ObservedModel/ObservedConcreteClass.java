package com.design.pattern.observer.template.ObservedModel;

import com.design.pattern.observer.template.ObservableModel.Observable;

public class ObservedConcreteClass implements Observed {

    Observable observable;
    public ObservedConcreteClass(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
    }
}
