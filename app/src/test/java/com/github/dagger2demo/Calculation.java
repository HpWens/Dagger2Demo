package com.github.dagger2demo;

/**
 * Created by boby on 2017/2/13.
 */

public class Calculation {

    private CalculationState mCalculationState;

    public Calculation(CalculationState calculationState) {
        mCalculationState = calculationState;
    }

    public void calculation() {
        mCalculationState.calculation(this);
    }

    public int getResult() {
        return mCalculationState.getResult();
    }

    public CalculationState getCalculationState() {
        return mCalculationState;
    }

    public void setCalculationState(CalculationState calculationState) {
        mCalculationState = calculationState;
    }
}
