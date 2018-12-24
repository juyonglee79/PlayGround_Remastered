package com.dsm2018.playground_remastered.Connect

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Connector {

    lateinit var api: API

    private val url = "http://13.59.174.126:3000/"

    init {
        val logger = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().addInterceptor(logger).build()
        val retrofit = Retrofit.Builder()
                .client(client)
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        api = retrofit.create(API::class.java)
    }

}
