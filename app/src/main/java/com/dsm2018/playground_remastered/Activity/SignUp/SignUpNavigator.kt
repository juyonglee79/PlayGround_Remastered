package com.dsm2018.playground_remastered.Activity.SignUp

import android.content.Intent

interface SignUpNavigator{
    fun finishActivity()
    fun nextActivity(intent: Intent)
}