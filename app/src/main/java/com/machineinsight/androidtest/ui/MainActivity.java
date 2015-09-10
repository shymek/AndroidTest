package com.machineinsight.androidtest.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.machineinsight.androidtest.R;
import com.machineinsight.androidtest.databinding.ActivityMainBinding;
import com.machineinsight.androidtest.ui.model.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private MainViewModel mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setModel(mModel = new MainViewModel(this));
    }
}
