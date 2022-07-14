package com.prabhakar.lovelife_assignment

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Network {

    private fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api.github.com/users/")
            .client(
                OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun provideAPIService(): APIService {
        return getRetrofitInstance().create(APIService::class.java)
    }

}