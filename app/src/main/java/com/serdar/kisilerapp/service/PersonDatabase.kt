package com.serdar.kisilerapp.service

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.serdar.kisilerapp.data.model.Kisiler

@Database(entities = [Kisiler::class], version = 1)
abstract class PersonDatabase:RoomDatabase() {

    abstract fun getDao():PersonsDao

    companion object {
        @Volatile
        private var INSTANCE: PersonDatabase? = null

        fun getDatabase(context: Context): PersonDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    PersonDatabase::class.java,
                    "persons_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                return instance
            }
        }

    }
}