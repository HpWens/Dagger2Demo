package com.github.dagger2demo.presenter;

import com.github.dagger2demo.biz.ILoginBiz;
import com.github.dagger2demo.biz.LoginBiz;
import com.github.dagger2demo.view.ILoginView;

import javax.inject.Inject;

/**
 * Created by boby on 2017/2/8.
 */

public class LoginPresenter {

    LoginBiz mLoginBiz;

    ILoginView mILoginView;

    @Inject
    public LoginPresenter(ILoginView ILoginView) {
        mILoginView = ILoginView;
        mLoginBiz = LoginBiz.getInstance();
    }


    public void login(String username, String password) {
        if (username.equals("") || password.equals("")) {
            mILoginView.emptyData();
        } else {
            mLoginBiz.login(username, password, new ILoginBiz() {
                @Override
                public void loginSuccess() {
                    //如果是网络请求，请注意切换到主线程
                    mILoginView.loginSuccess();
                }

                @Override
                public void loginFailed() {
                    mILoginView.loginFailed();
                }
            });
        }
    }

}
