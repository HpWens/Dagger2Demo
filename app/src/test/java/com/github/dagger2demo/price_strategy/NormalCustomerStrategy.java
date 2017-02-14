package com.github.dagger2demo.price_strategy;

/**
 * Created by boby on 2017/2/14.
 */

/**
 * 具体算法的实现类，为新客户或者普通客户计算应报的价格
 */
public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        //对于新客户或普通客户，没有折扣
        return goodsPrice;
    }
}
