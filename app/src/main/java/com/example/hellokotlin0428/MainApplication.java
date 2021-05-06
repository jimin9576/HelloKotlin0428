package com.example.hellokotlin0428;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {
    private static Context appContext; //applicationContext

    public static Context get_AppContext() { //static을 사용하면 객체를 만들지 않고도 사용할 수 있다.
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }
}
