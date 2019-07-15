package com.dawidj.netgurucompass.di.module

import com.dawidj.netgurucompass.data.repository.CompassRepository
import com.dawidj.netgurucompass.data.repository.CompassRepositoryImpl
import com.dawidj.netgurucompass.data.repository.LocationRepository
import com.dawidj.netgurucompass.data.repository.LocationRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    internal abstract fun bindCompassRepository(repository: CompassRepositoryImpl): CompassRepository

    @Binds
    internal abstract fun bindLocationRepository(repository: LocationRepositoryImpl): LocationRepository

}