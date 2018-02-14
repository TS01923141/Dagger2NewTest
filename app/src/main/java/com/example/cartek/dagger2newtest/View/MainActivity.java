package com.example.cartek.dagger2newtest.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cartek.dagger2newtest.Car;
import com.example.cartek.dagger2newtest.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
