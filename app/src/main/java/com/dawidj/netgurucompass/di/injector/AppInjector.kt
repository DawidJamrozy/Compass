package com.dawidj.netgurucompass.di.injector

import android.app.Activity
import android.os.Bundle
import com.dawidj.netgurucompass.CompassApplication
import com.dawidj.netgurucompass.di.component.ApplicationComponent
import com.dawidj.netgurucompass.util.SimpleActivityLifecycleCallbacks
import dagger.android.AndroidInjection
import dagger.android.support.HasSupportFragmentInjector

class AppInjector {

    companion object {

        fun init(application: CompassApplication, applicationComponent: ApplicationComponent) {
            applicationComponent.inject(application)
            application.registerActivityLifecycleCallbacks(object : SimpleActivityLifecycleCallbacks() {
                override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                    handleActivity(activity)
                }
            })
        }

        private fun handleActivity(activity: Activity) {
            if (activity is HasSupportFragmentInjector) AndroidInjection.inject(activity)
        }
    }
}