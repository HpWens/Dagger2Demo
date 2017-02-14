package com.github.dagger2demo.state;

/**
 * Created by boby on 2017/2/13.
 */

public class LeaveRequestModel {

    /**
     * 请假人
     */
    private String user;

    /**
     * 请假开始时间
     */
    private String beginDate;

    /**
     * 请假天数
     */
    private int leaveDays;

    /**
     * 审核结果
     */
    private int result;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
