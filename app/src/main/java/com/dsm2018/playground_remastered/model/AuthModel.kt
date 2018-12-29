package com.dsm2018.playground_remastered.model

import com.google.gson.annotations.*

data class AuthModel(@SerializedName("accessToken") val token: String,
                     @SerializedName("refreshToken") val refreshToken: String)
