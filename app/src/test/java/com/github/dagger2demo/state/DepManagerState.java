package com.github.dagger2demo.state;

/**
 * Created by boby on 2017/2/13.
 */

public class DepManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine ctx) {

        LeaveRequestModel lrm= (LeaveRequestModel) ctx.getBusinessVO();


        ctx.setState(new AuditOverState());
    }
}
