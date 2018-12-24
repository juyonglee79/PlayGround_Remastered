package com.dsm2018.playground_remastered.Activity.SignUp

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dsm2018.playground_remastered.Activity.SignIn.SignInActivity
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.databinding.ActivitySigninBinding

class SignUpActivity : AppCompatActivity(), SignUpNavigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivitySigninBinding = DataBindingUtil.setContentView(this, R.layout.activity_signup)

    }

    override fun finishActivity() {
        finish()
    }

    override fun nextActivity(intent: Intent) {
        startActivity(Intent(applicationContext, SignInActivity::class.java))
    }

}
