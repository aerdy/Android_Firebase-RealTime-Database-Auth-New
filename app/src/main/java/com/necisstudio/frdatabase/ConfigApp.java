package com.necisstudio.frdatabase;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Jarcode on 2016-05-30.
 */

public class ConfigApp extends Application {
    public static  FirebaseDatabase database ;
    @Override
    public void onCreate() {
        super.onCreate();
        database = FirebaseDatabase.getInstance();

    }
}
