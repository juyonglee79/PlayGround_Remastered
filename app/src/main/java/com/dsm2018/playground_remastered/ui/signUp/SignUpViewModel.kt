package com.dsm2018.playground_remastered.ui.signUp

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SignUpViewModel(private val signUpNavigator : SignUpNavigator?) : ViewModel() {

    var signUpName = MutableLiveData<String>()
    var signUpId = MutableLiveData<String>()
    var signUpPw = MutableLiveData<String>()
    var signUpConfirm = MutableLiveData<String>()


    fun signUpPost() {
        if (signUpName.isValueBlank() || signUpId.isValueBlank() || signUpPw.isValueBlank() || signUpConfirm.isValueBlank()) {
            signUpNavigator?.fail("모든 항목을 입력하세요.")
        } else {
            signUpNavigator!!.signUpPost()
        }
    }

    fun MutableLiveData<String>.isValueBlank() =
            this.value.isNullOrBlank()

}