package com.github.dagger2demo.state;

/**
 * Created by boby on 2017/2/13.
 */

/**
 * 公共状态处理机，相当于状态模式的Context
 * 包含所有流程使用状态模式时的公共功能
 */
public class StateMachine {

    /**
     * 持有一个状态的对象
     */
    private State mState = null;

    /**
     * 执行工作，客户端处理流程的接口方法。
     * 在客户完成自己的业务工作后调用
     */
    public void doWork() {
        mState.doWork(this);
    }

    /**
     * 包含流程处理需要的业务数据对象，不知道具体类型,为了简单，不去使用泛型，
     * 用Object，反正只是传递到具体的状态对象里面
     */
    private Object businessVO = null;

    public State getState() {
        return mState;
    }

    public void setState(State state) {
        mState = state;
    }

    public Object getBusinessVO() {
        return businessVO;
    }

    public void setBusinessVO(Object businessVO) {
        this.businessVO = businessVO;
    }
}
