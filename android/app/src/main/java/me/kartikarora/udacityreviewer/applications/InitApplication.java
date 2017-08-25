package me.kartikarora.udacityreviewer.applications;

import android.app.Application;

import com.facebook.stetho.Stetho;

import me.kartikarora.udacityreviewer.BuildConfig;
import timber.log.Timber;


/**
 * Developer: chipset
 * Package : me.kartikarora.udacityreviewer.applications
 * Project : udacity-reviewer-android
 * Date : 5/4/17
 */

public class InitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
            Stetho.initializeWithDefaults(getApplicationContext());
        }
    }
}
