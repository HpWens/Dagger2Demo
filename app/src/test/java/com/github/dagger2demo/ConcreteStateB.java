package com.github.dagger2demo;

/**
 * Created by boby on 2017/2/13.
 */

public class ConcreteStateB extends CalculationState {

    public ConcreteStateB(int x) {
        super(x);
    }

    @Override
    public void calculation(Calculation calculation) {
        calculation.setCalculationState(new ConcreteStateC(x));
    }

    @Override
    public int getResult() {
        return 3 * x + 6;
    }
}
