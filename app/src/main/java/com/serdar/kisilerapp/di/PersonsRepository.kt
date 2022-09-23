package com.serdar.kisilerapp.di

import androidx.lifecycle.LiveData
import com.serdar.kisilerapp.data.model.Kisiler
import com.serdar.kisilerapp.service.PersonsDao
import javax.inject.Inject

class PersonsRepository @Inject constructor(private val personsDao: PersonsDao) {


   suspend fun getPersons(): List<Kisiler> {
        return personsDao.readAllData()
    }
    suspend fun addPersons(kisiler: Kisiler){
        personsDao.addPerson(kisiler)
    }
    suspend fun deletePersons(kisiler: Kisiler){
        personsDao.deletePerson(kisiler)
    }
    suspend fun deleteAll(kisiler: Kisiler){
        personsDao.deleteAllPersons(kisiler)
    }
    suspend fun updatePerson(kisiler: Kisiler){
        personsDao.updatePerson(kisiler)
    }
}