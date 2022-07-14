package com.prabhakar.lovelife_assignment

import com.prabhakar.lovelife_assignment.data.ResponseModel

class Repository {
    private val apiService = Network.provideAPIService()
    suspend fun getData(): List<ResponseModel> {
       return apiService.getData()
    }
}