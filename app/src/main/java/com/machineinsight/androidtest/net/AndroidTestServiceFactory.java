package com.machineinsight.androidtest.net;

import android.support.annotation.NonNull;

import retrofit.RestAdapter;

public class AndroidTestServiceFactory {
    public static final String SERVICE_URL = "http://devsao.flatmates.mydevil.net";

    private static AndroidTestServiceFactory sFactory;
    private AndroidTestService mService;

    public static @NonNull AndroidTestServiceFactory getInstance() {
        if (sFactory == null) {
            sFactory = new AndroidTestServiceFactory();
        }

        return sFactory;
    }

    public @NonNull AndroidTestService getService() {
        if (mService == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(SERVICE_URL)
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();

            mService = restAdapter.create(AndroidTestService.class);
        }

        return mService;
    }
}