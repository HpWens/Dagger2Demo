package com.github.dagger2demo.state;

/**
 * Created by boby on 2017/2/13.
 */

/**
 * 公共状态接口
 */
public interface State {

    /**
     * 执行状态对于的功能处理
     *
     * @param ctx 上下文实例对象
     */
    public void doWork(StateMachine ctx);

}
