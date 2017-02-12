package com.github.dagger2demo.biz;

/**
 * Created by boby on 2017/2/8.
 */

public class LoginBiz {


    public static LoginBiz instance;

    public LoginBiz() {
    }

    public static LoginBiz getInstance() {
        if (instance == null) {
            synchronized (LoginBiz.class) {
                if (instance == null) {
                    instance = new LoginBiz();
                }
            }
        }
        return instance;
    }


    //登录
    public void login(String username, String password, ILoginBiz iLoginBiz) {

        //模拟处理
        if (username.equals("123456") && password.equals("2017")) {
            iLoginBiz.loginSuccess();
        } else {
            iLoginBiz.loginFailed();
        }

    }


}
