package com.example.cartek.dagger2newtest.View;

import com.example.cartek.dagger2newtest.Car;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by CarTek on 2018/2/14.
 */
@Module
public abstract class MainActivityModule {

//    @Binds
//    abstract Car bindContext(Car car);

    @Provides
    static Car provideCar(){
        return new Car();
    }
}
