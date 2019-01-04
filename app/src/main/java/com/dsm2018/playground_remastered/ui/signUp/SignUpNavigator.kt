package com.dsm2018.playground_remastered.ui.signUp

interface SignUpNavigator {
    fun success(message: String)
    fun fail(message: String)
    fun signUpPost()
}