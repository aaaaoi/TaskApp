package jp.techacademy.saori.tawada.taskapp;

/**
 * Created by admin on 2018/03/05.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
