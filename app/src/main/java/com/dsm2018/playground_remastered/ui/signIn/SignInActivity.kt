package com.dsm2018.playground_remastered.ui.signIn

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.widget.Toast
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.databinding.ActivitySignInBinding
import com.dsm2018.playground_remastered.ui.main.MainActivity
import com.dsm2018.playground_remastered.ui.signUp.SignUpActivity
import com.dsm2018.playground_remastered.util.DataBindingActivity
import org.jetbrains.anko.startActivity

class SignInActivity : DataBindingActivity<ActivitySignInBinding>(), SignInNavigator {

    override val layoutId: Int
        get() = R.layout.activity_sign_in

    private val factory = SignInViewModelFactory(this)
    private val viewModel: SignInViewModel by lazy { ViewModelProviders.of(this, factory).get(SignInViewModel::class.java) }

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

    override fun signInBtn() {
        startActivity<MainActivity>()
    }

    override fun signUpBtn() {
        startActivity<SignUpActivity>()
    }

}