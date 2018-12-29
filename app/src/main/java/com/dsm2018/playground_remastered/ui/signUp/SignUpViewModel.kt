package com.dsm2018.playground_remastered.ui.signUp

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.Context
import android.databinding.ObservableField
import android.databinding.ObservableInt

class SignUpViewModel : ViewModel() {

    var name = MutableLiveData<String>()
    var id = MutableLiveData<String>()
    var password = MutableLiveData<String>()
    var confirm = MutableLiveData<String>()

    val checkPw = ObservableField("")

    val checkPwBoolean = ObservableInt(-1) // -1: 초기값 0: 거짓 1: 참

    fun check(context: Context) {
        checkValidate()
    }

    fun checkValidate() {
        if (name.isValueBlank() || id!!.isValueBlank() || password.isValueBlank() || confirm.isValueBlank()) {
            checkPw.set("모두 입력하세요")
            checkPwBoolean.set(0)
        } else if (confirm != password) {
            checkPw.set("비밀번호가 일치하지 않습니다.")
            checkPwBoolean.set(0)
        } else {
            checkPw.set("회원가입을 하실 수 있습니다")
            checkPwBoolean.set(1)
        }
    }

    fun signUp() { // 회원가입

    }

    fun MutableLiveData<String>.isValueBlank() =
            this.value.isNullOrBlank()


}
