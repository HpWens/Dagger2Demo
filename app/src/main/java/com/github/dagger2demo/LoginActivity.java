package com.github.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.github.dagger2demo.component.DaggerLoginComponent;
import com.github.dagger2demo.module.LoginModule;
import com.github.dagger2demo.presenter.LoginPresenter;
import com.github.dagger2demo.view.ILoginView;

import javax.inject.Inject;

/**
 * Created by boby on 2017/2/8.
 */

public class LoginActivity extends AppCompatActivity implements ILoginView {

    //注入
    @Inject
    LoginPresenter mLoginPresenter;

    EditText mEtUsername, mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtUsername = (EditText) findViewById(R.id.et_username);
        mEtPassword = (EditText) findViewById(R.id.et_password);


        DaggerLoginComponent.builder().loginModule(new LoginModule(this)).build().inject(this);

    }


    @Override
    public void emptyData() {
        Toast.makeText(this, getString(R.string.empty_data), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, getString(R.string.login_failed), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, getString(R.string.login_success), Toast.LENGTH_SHORT).show();
    }

    public void login(View view) {
        mLoginPresenter.login(mEtUsername.getText().toString(), mEtPassword.getText().toString());
    }

}
