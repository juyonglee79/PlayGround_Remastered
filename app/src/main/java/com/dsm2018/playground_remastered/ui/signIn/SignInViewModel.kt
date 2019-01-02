package com.dsm2018.playground_remastered.ui.signIn

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SignInViewModel(private val signInNavigator : SignInNavigator?) : ViewModel() {

    var signInId = MutableLiveData<String>()
    var signInPw = MutableLiveData<String>()

    fun signInPost() {
        if (signInId.isValueBlank() || signInPw.isValueBlank()) {
            signInNavigator?.fail("아이디와 패스워드를 입력하세요.")
        } else {
            signInNavigator!!.signInBtn()
        }
    }

    fun toSignUp() {
        signInNavigator!!.signUpBtn()
    }

    fun MutableLiveData<String>.isValueBlank() =
            this.value.isNullOrBlank()

}