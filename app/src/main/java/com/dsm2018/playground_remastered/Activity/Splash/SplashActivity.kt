package com.dsm2018.playground_remastered.Activity.Splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.dsm2018.playground_remastered.Activity.SignIn.SignInActivity
import com.dsm2018.playground_remastered.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splsh)
        startLoading();
    }

    private fun startLoading(){
        val handler = Handler()
        handler.postDelayed({
            val toLogin = Intent(this, SignInActivity::class.java)
            startActivity(toLogin)
        },2000)
    }
}
