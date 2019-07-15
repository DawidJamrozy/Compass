package com.dawidj.netgurucompass.di.module

import dagger.Module

@Module(includes = [ViewModelModule::class, RepositoryModule::class])
class AppModule