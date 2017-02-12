package com.github.dagger2demo.module;

import com.github.dagger2demo.view.ILoginView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by boby on 2017/2/8.
 */
@Module
public class LoginModule {

    private final ILoginView mILoginView;

    public LoginModule(ILoginView ILoginView) {
        mILoginView = ILoginView;
    }

    @Provides
    ILoginView provideLoginView() {
        return mILoginView;
    }

}
