package com.dsm2018.playground_remastered.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.dsm2018.playground_remastered.R
import com.dsm2018.playground_remastered.ui.signIn.SignInActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val navigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_apply -> {
                message.setText(R.string.navigation_apply)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_post -> {
                message.setText(R.string.navigation_post)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tournamet -> {
                message.setText(R.string.navigation_tournament)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_myPage -> {
                message.setText(R.string.navigation_myPage)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = findViewById<TextView>(R.id.message)
        message.setOnClickListener { user ->val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)}

        navigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener)

    }
}
