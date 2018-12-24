package com.dsm2018.playground_remastered.Activity.SignUp

import android.content.Context
import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.view.View
import com.dsm2018.playground_remastered.Base.Res
import com.dsm2018.playground_remastered.Connect.Connector
import com.dsm2018.playground_remastered.Connect.Util.showToast

class SignUpViewModel(val signUpNavigator: SignUpNavigator) {

    var name = ObservableField<String>("")
    var id = ObservableField<String>("")
    var password = ObservableField<String>("")
    var confirm = ObservableField<String>("")

    val checkPw = ObservableField("")

    val checkPwBoolean = ObservableInt(-1) // -1: 초기값 0: 거짓 1: 참

    fun check(context: Context) {
        checkValidate()
//        checkOverlap(context)
    }

    fun checkValidate() {
        val signupName = name.get()
        val signupId = id.get()
        val signupPw = password.get()
        val signupConfirmPw = confirm.get()
        if (signupName!!.isEmpty() || signupId!!.isEmpty() || signupPw!!.isEmpty() || signupConfirmPw!!.isEmpty()) {
            checkPw.set("모두 입력하세요")
            checkPwBoolean.set(0)
        } else if (signupConfirmPw != signupPw) {
            checkPw.set("비밀번호가 일치하지 않습니다.")
            checkPwBoolean.set(0)
        } else {
            checkPw.set("회원가입을 하실 수 있습니다")
            checkPwBoolean.set(1)
        }
    }

    fun signUp(view: View) { // 회원가입
        Connector.api.signUp(hashMapOf(
                "name" to name.get()!!.trim(),
                "id" to id.get()!!.trim(),
                "password" to password.get()!!.trim()))
                .enqueue(object : Res<Void>(view.context) {
                    override fun callBack(code: Int, body: Void?) {
                        showToast((view.context), when (code) {
                            201 -> {
                                signUpNavigator.finishActivity()
                                "회원가입을 성공하셨습니다."
                            }
                            400 -> "회원가입에 실패하셨습니다"
                            else -> "오류 : $code"
                        })
                    }
                })
    }

}
