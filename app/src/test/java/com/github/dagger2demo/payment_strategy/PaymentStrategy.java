package com.github.dagger2demo.payment_strategy;

/**
 * Created by boby on 2017/2/14.
 */

/**
 * 支付工资的策略的接口，公司又多种支付工资的算法
 * 比如：现金、银行卡、现金加期权、美元支付等
 */
public interface PaymentStrategy {

    /**
     * 公司给某人支付工资
     *
     * @param ctx 支付工资的上下文，包含算法需要的数据
     */
    void pay(PaymentContext ctx);
}
