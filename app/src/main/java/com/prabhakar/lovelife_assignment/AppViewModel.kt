package com.prabhakar.lovelife_assignment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.prabhakar.lovelife_assignment.data.ResponseModel
import kotlinx.coroutines.Dispatchers

class AppViewModel : ViewModel() {

    private val repository = Repository()
    fun getAllData(): LiveData<List<ResponseModel>> {
        return liveData(Dispatchers.IO) {
            val data = repository.getData()
            emit(data)
        }
    }
}