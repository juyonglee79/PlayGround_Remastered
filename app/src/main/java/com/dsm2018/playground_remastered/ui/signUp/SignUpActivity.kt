package com.dsm2018.playground_remastered.ui.signUp

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.widget.Toast
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.databinding.ActivitySignUpBinding
import com.dsm2018.playground_remastered.ui.main.MainActivity
import com.dsm2018.playground_remastered.ui.signIn.SignInActivity
import com.dsm2018.playground_remastered.util.DataBindingActivity
import org.jetbrains.anko.startActivity

class SignUpActivity : DataBindingActivity<ActivitySignUpBinding>(), SignUpNavigator {

    override val layoutId: Int
        get() = R.layout.activity_sign_up

    private val factory = SignUpViewModelFactory(this)
    private val viewModel: SignUpViewModel by lazy { ViewModelProviders.of(this, factory).get(SignUpViewModel::class.java) }

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = viewModel

    }

    override fun success(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        startActivity<MainActivity>()
    }

    override fun fail(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun signUpPost() {
        startActivity<SignInActivity>()
    }



}