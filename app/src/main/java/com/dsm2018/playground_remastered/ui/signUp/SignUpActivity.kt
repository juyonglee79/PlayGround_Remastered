package com.dsm2018.playground_remastered.ui.signUp

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import com.dsm2018.playground_remastered.ui.signIn.SignInActivity
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.databinding.ActivitySignupBinding
import com.dsm2018.playground_remastered.util.DataBindingActivity

class SignUpActivity : DataBindingActivity<ActivitySignupBinding>(), SignUpNavigator {

    override val layoutId: Int
        get() = R.layout.activity_signup

    val viewModel: SignUpViewModel by lazy { ViewModelProviders.of(this)[SignUpViewModel::class.java] }

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = viewModel

    }

    override fun finishActivity() {
        finish()
    }

    override fun nextActivity(intent: Intent) {
        startActivity(Intent(applicationContext, SignInActivity::class.java))
    }

}
