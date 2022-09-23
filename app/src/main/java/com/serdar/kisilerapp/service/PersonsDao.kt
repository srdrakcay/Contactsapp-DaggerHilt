package com.serdar.kisilerapp.service

import androidx.lifecycle.LiveData
import androidx.room.*
import com.serdar.kisilerapp.data.model.Kisiler

@Dao
interface PersonsDao {
    @Query(value = "SELECT * FROM contacts ORDER BY id ASC")
   suspend  fun readAllData():List<Kisiler>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend   fun addPerson(kisiler: Kisiler):Long

    @Update
    suspend fun updatePerson(kisiler: Kisiler)

    @Delete
    suspend  fun deletePerson(kisiler: Kisiler)

    @Query("DELETE FROM contacts ")
    suspend fun deleteAllPersons(kisiler: Kisiler)
}