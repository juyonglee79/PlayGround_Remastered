package com.dsm2018.playground_remastered.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.dsm2018.playground_remastered.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val navigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_apply -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_post -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tournament -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_myPage -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener)

    }
}
