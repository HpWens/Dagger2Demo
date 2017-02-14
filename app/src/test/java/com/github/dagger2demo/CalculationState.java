package com.github.dagger2demo;

/**
 * Created by boby on 2017/2/13.
 */

public abstract class CalculationState {

    protected int x;

    public CalculationState(int x) {
        this.x = x;
    }

    public int getResult() {
        return x;
    }

    public abstract void calculation(Calculation calculation);

}
