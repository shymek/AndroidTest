package com.machineinsight.androidtest.ui.model;

import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.machineinsight.androidtest.R;

public class MainViewModel extends BaseViewModel {
    public ObservableInt mHelloLabel = new ObservableInt(R.string.hello_world);

    public MainViewModel(@NonNull AppCompatActivity activity) {
        super(activity);
    }
}