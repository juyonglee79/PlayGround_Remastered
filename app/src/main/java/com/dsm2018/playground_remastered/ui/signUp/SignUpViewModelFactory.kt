package com.dsm2018.playground_remastered.ui.signUp

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class SignUpViewModelFactory(private val signUpNavigator: SignUpNavigator) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(SignUpNavigator::class.java).newInstance(signUpNavigator)
    }
}