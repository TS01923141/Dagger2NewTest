package com.example.cartek.dagger2newtest;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by CarTek on 2018/2/14.
 */
@Module
public abstract class MainAppModule {

    @Binds
    abstract Context bindContext(Application application);
}
