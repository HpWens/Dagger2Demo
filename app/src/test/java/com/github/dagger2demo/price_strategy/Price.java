package com.github.dagger2demo.price_strategy;

/**
 * Created by boby on 2017/2/14.
 */

/**
 * 价格管理，主要完成计算向客户所报价格的功能
 */
public class Price {

    /**
     * 持有一个具体的策略对象
     */
    private Strategy strategy;


    /**
     * 构造方法，传入一个具体的策略对象
     *
     * @param strategy 具体的策略对象
     */
    public Price(Strategy strategy) {
        this.strategy = strategy;
    }


    /**
     * 报价，计算对客户的报价
     *
     * @param goodsPrice
     * @return 计算出来的，给客户报的价格
     */
    public double quote(double goodsPrice) {
        return strategy.calcPrice(goodsPrice);
    }
}
