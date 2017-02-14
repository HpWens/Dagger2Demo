package com.github.dagger2demo.price_strategy;

/**
 * Created by boby on 2017/2/14.
 */

/**
 * 具体算法实现，为大客户计算应报的价格
 */
public class LargeCustomerStrategy implements Strategy {

    private static final float DISCOUNT_RATE = 0.1f;

    @Override
    public double calcPrice(double goodsPrice) {
        //对于大客户，统一折扣10%
        return goodsPrice * (1 - DISCOUNT_RATE);
    }
}
