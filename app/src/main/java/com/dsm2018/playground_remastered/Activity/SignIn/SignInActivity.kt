package com.dsm2018.playground_remastered.Activity.SignIn

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.dsm2018.playground_remastered.Activity.Main.MainActivity
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.databinding.ActivitySigninBinding

class SignInActivity : AppCompatActivity(), SignInNavigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivitySigninBinding = DataBindingUtil.setContentView(this, R.layout.activity_signin)
    }


    override fun success(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        startActivity(Intent(applicationContext, MainActivity::class.java))
    }

    override fun fail(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}