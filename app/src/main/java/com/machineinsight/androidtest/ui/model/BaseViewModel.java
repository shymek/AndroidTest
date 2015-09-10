package com.machineinsight.androidtest.ui.model;

import android.content.Context;
import android.content.res.Resources;
import android.databinding.BaseObservable;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import java.lang.ref.WeakReference;

public class BaseViewModel extends BaseObservable {
    private final WeakReference<AppCompatActivity> mActivity;

    protected @NonNull Context getActivityContext() {
        return mActivity.get();
    }

    protected @NonNull Resources getResources() {
        return mActivity.get().getResources();
    }

    protected @NonNull FragmentManager getFragmentManager() {
        return mActivity.get().getSupportFragmentManager();
    }

    protected void finish() {
        mActivity.get().finish();
    }

    protected BaseViewModel(@NonNull AppCompatActivity activity) {
        mActivity = new WeakReference<>(activity);
    }
}