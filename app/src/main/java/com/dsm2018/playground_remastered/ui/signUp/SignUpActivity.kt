package com.dsm2018.playground_remastered.ui.signUp

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.databinding.ActivitySignUpBinding
import com.dsm2018.playground_remastered.util.DataBindingActivity

class SignUpActivity : DataBindingActivity<ActivitySignUpBinding>(){

    override val layoutId: Int
        get() = R.layout.activity_sign_up

    val viewModel: SignUpViewModel by lazy { ViewModelProviders.of(this)[SignUpViewModel::class.java] }

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = viewModel

    }


}