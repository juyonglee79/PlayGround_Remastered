package com.dsm2018.playground_remastered.ui.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.databinding.ActivitySignInBinding

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivitySignInBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}