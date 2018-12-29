package com.dsm2018.playground_remastered.ui.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.support.annotation.Nullable
import com.dsm2018.playground_remastered.ui.signIn.SignInActivity


class SplashActivity : AppCompatActivity() {

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)

        finish()
    }
}
