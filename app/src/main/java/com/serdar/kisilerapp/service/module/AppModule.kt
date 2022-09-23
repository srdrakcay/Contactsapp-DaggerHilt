package com.serdar.kisilerapp.service.module

import android.content.Context
import com.serdar.kisilerapp.service.PersonDatabase
import com.serdar.kisilerapp.service.PersonsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getDatabase(context: Context): PersonDatabase{
        return PersonDatabase.getDatabase(context)
    }

    @Singleton
    @Provides
    fun getDao(personDatabase: PersonDatabase): PersonsDao{
        return personDatabase.getDao()
    }
}