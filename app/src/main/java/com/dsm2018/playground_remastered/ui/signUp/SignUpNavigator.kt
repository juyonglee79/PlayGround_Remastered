package com.dsm2018.playground_remastered.ui.signUp

import android.content.Intent

interface SignUpNavigator{
    fun finishActivity()
    fun nextActivity(intent: Intent)
}