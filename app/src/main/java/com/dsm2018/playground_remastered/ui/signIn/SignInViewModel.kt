package com.dsm2018.playground_remastered.ui.signIn

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.Intent

class SignInViewModel : ViewModel(), SignInNavigator {

    var signInId = MutableLiveData<String>()
    var signInPw = MutableLiveData<String>()
    val signInNavigator : SignInNavigator? = null

    fun signInPost() {
        if (signInId.isValueBlank() || signInPw.isValueBlank()) {
            if (signInNavigator != null) {
                signInNavigator.fail("아이디와 패스워드를 입력하세요.")
            }
        } else {

        }
    }

    override fun fail(result: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun success(result: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun intent() {
        if (signInNavigator != null) {
            signInNavigator.intent()
        }
    }

    fun MutableLiveData<String>.isValueBlank() =
            this.value.isNullOrBlank()

}