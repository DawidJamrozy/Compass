package com.dawidj.netgurucompass.di.module

import com.dawidj.netgurucompass.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModuleBuilder {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

}