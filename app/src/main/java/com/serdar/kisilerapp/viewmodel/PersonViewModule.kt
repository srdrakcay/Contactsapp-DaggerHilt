package com.serdar.kisilerapp.viewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.kisilerapp.data.model.Kisiler
import com.serdar.kisilerapp.di.PersonsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonViewModule @Inject constructor(private val personsRepository: PersonsRepository) :
    ViewModel() {

    var personsDao: MutableLiveData<List<Kisiler>> = MutableLiveData()


    fun getAllData(): MutableLiveData<List<Kisiler>> {
        return personsDao
    }


     fun addPersons(kisiler: Kisiler) {
        viewModelScope.launch(Dispatchers.IO) {
            personsRepository.addPersons(kisiler)
        }
    }

     fun deletePersons(kisiler: Kisiler) {
        viewModelScope.launch(Dispatchers.IO) {
            personsRepository.deletePersons(kisiler)
        }
    }

     fun updatePersons(kisiler: Kisiler) {
        viewModelScope.launch(Dispatchers.IO) {
            personsRepository.updatePerson(kisiler)
        }
    }
}
