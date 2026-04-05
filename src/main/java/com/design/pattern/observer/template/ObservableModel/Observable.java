package com.design.pattern.observer.template.ObservableModel;

import com.design.pattern.observer.template.ObservedModel.Observed;

import java.util.List;

public interface Observable {

    void adds(Observed observed);
    void remove(Observed observed);
    void notifies();

    void setValue(Object value);

}