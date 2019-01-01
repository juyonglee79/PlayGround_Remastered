package com.dsm2018.playground_remastered.ui.signIn

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SignInViewModel : ViewModel(), SignInNavigator {

    var signInId = MutableLiveData<String>()
    var signInPw = MutableLiveData<String>()
    private val signInNavigator : SignInNavigator? = null

    fun signInPost() {
        if (signInId.isValueBlank() || signInPw.isValueBlank()) {
            signInNavigator?.fail("아이디와 패스워드를 입력하세요.")
        } else {

        }
    }

    override fun fail(message : String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun success(message : String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun MutableLiveData<String>.isValueBlank() =
            this.value.isNullOrBlank()

}