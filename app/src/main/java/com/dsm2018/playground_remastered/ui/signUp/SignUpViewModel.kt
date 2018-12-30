package com.dsm2018.playground_remastered.ui.signUp

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {

    var signUpName = MutableLiveData<String>()
    var signUpId = MutableLiveData<String>()
    var signUpPw = MutableLiveData<String>()
    var signUpConfirm = MutableLiveData<String>()


    fun signUpPost() {
        if (signUpName.isValueBlank() || signUpId.isValueBlank() || signUpPw.isValueBlank() || signUpConfirm.isValueBlank()) {
//            signInNavigator.fail("아이디와 패스워드를 입력하세요.")
        } else {

        }
    }

    fun MutableLiveData<String>.isValueBlank() =
            this.value.isNullOrBlank()

}