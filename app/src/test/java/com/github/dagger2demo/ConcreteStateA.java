package com.github.dagger2demo;

/**
 * Created by boby on 2017/2/13.
 */

public class ConcreteStateA extends CalculationState {

    public ConcreteStateA(int x) {
        super(x);
    }

    @Override
    public void calculation(Calculation calculation) {
        calculation.setCalculationState(new ConcreteStateB(x));
    }

    @Override
    public int getResult() {
        return 2 * x;
    }
}
