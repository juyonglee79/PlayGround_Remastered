package com.dsm2018.playground_remastered.connect

import android.telecom.Call
import com.dsm2018.playground_remastered.model.AuthModel
import retrofit2.http.*

interface API {

    @POST("/auth")
    fun signIn(@Body body: Any?): Call<AuthModel>

    @POST("student/signup")
    fun signUp(@Body body: Any?): Call<Void>
}