package com.dsm2018.playground_remastered.ui.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.dsm2018.playground_remastered.ui.signIn.SignInActivity


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(applicationContext, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}
