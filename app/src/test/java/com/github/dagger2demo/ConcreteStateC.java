package com.github.dagger2demo;

/**
 * Created by boby on 2017/2/13.
 */

public class ConcreteStateC extends CalculationState {

    public ConcreteStateC(int x) {
        super(x);
    }

    @Override
    public void calculation(Calculation calculation) {
      calculation.setCalculationState(new ConcreteStateA(x));
    }

    @Override
    public int getResult() {
        return 4*x;
    }
}
