package com.dsm2018.playground_remastered.ui.signIn

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.databinding.ActivitySignInBinding
import com.dsm2018.playground_remastered.ui.main.MainActivity
import com.dsm2018.playground_remastered.ui.signUp.SignUpActivity
import com.dsm2018.playground_remastered.util.DataBindingActivity

class SignInActivity : DataBindingActivity<ActivitySignInBinding>(), SignInNavigator{
    override val layoutId: Int
        get() = R.layout.activity_sign_in

    val viewModel: SignInViewModel by lazy { ViewModelProviders.of(this)[SignInViewModel::class.java] }

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = viewModel

    }

    override fun success(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        startActivity(Intent(applicationContext, MainActivity::class.java))
    }

    override fun fail(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    override fun intent() {
        startActivity(Intent(applicationContext, SignUpActivity::class.java))
    }


}
