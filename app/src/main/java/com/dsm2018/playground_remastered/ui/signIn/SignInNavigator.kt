package com.dsm2018.playground_remastered.ui.signIn

interface SignInNavigator{
    fun success(result: String)
    fun fail(result: String)
    fun intent()
}