package com.github.dagger2demo.price_strategy;

/**
 * Created by boby on 2017/2/14.
 */

/**
 * 具体算法实现，为老客户计算应报的价格
 */
public class OldCustomerStrategy implements Strategy {

    private static final float DISCOUNT_RATE = 0.05f;

    @Override
    public double calcPrice(double goodsPrice) {
        //对于老客户，统一折扣5%
        return goodsPrice * (1 - DISCOUNT_RATE);
    }
}
