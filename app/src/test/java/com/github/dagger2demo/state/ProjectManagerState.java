package com.github.dagger2demo.state;

/**
 * Created by boby on 2017/2/13.
 */

public class ProjectManagerState implements LeaveRequestState {

    @Override
    public void doWork(StateMachine ctx) {

        LeaveRequestModel lrm = (LeaveRequestModel) ctx.getBusinessVO();

        if ("同意".equals(lrm.getResult())) {

            if (lrm.getLeaveDays() > 3) {
                //如果请假天数大于3天，而且项目经理同意了，就提交给部门经理
                ctx.setState(new DepManagerState());
                //为部门经理增加一个工作
            } else {
                //3天以内的请假，由项目经理做主,
                //就不用提交给部门经理了，转向审核结束状态
                ctx.setState(new AuditOverState());
                //给申请人增加一个工作，让他查看审核结果
            }

        } else {
            //项目经理不同意的话，也就不用提交给部门经理了，转向审核结束状态
            ctx.setState(new AuditOverState());

            //给申请人增加一个工作，让他查看审核结果
        }

    }
}
