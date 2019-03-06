package com.edwardwan.misotofu;

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MisoTofuApplication extends Application {

    private FirebaseAnalytics firebaseAnalytics;

    public synchronized FirebaseAnalytics getFirebaseAnalytics() {
        if (firebaseAnalytics == null) {
            firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        }
        return firebaseAnalytics;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
