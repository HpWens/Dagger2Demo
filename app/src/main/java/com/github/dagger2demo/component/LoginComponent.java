package com.github.dagger2demo.component;

import com.github.dagger2demo.LoginActivity;
import com.github.dagger2demo.module.LoginModule;

import dagger.Component;

/**
 * Created by boby on 2017/2/8.
 */
@Component(modules = LoginModule.class)
public interface LoginComponent {
    public void inject(LoginActivity activity);
}
