package com.prabhakar.lovelife_assignment

import com.prabhakar.lovelife_assignment.data.ResponseModel
import retrofit2.http.GET

interface APIService {
    @GET("mralexgray")
  suspend  fun getData(): List<ResponseModel>
}