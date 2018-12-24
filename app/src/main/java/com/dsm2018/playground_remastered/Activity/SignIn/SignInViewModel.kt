package com.dsm2018.playground_remastered.Activity.SignIn

import android.databinding.ObservableField
import com.dsm2018.playground_remastered.Base.Res
import com.dsm2018.playground_remastered.Connect.Connector
import com.dsm2018.playground_remastered.Model.AuthModel

class SignInViewModel(val signInNavigator: SignInNavigator) {

    var id = ObservableField<String>("")
    var password = ObservableField<String>("")

    fun post() {
        if (id.get()!!.isEmpty() || password.get()!!.isEmpty()) {
            signInNavigator.fail("아이디와 패스워드를 입력하세요.")
        } else {
            Connector.api.signIn(hashMapOf("id" to id, "password" to password))
                    .enqueue(object : Res<AuthModel>(this, false) {
                        override fun callBack(code: Int, body: AuthModel?) {
                            when (code) {
                                201 -> {
                                    signInNavigator.success("로그인 성공")
                                }
                                401 -> signInNavigator.fail("로그인 실패")
                                else -> signInNavigator.fail("오류 : $code")
                            }
                        }
                    })
        }
    }
}