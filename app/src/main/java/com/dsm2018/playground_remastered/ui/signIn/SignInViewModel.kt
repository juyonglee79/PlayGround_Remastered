package com.dsm2018.playground_remastered.ui.signIn

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SignInViewModel : ViewModel() {

    var id = MutableLiveData<String>()
    var password = MutableLiveData<String>()

    fun post() {
        if (id.isValueBlank() || password.isValueBlank()) {
//            signInNavigator.fail("아이디와 패스워드를 입력하세요.")
        } else {

        }
    }

    fun MutableLiveData<String>.isValueBlank() =
            this.value.isNullOrBlank()

}