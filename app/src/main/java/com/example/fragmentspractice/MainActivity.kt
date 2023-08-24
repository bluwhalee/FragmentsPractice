package com.example.fragmentspractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.flfragment,firstFragment)
            commit()
        }
        findViewById<Button>(R.id.btnFrag1).setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flfragment,firstFragment)
                commit()
            }
        }
        findViewById<Button>(R.id.btnFrag2).setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flfragment,secondFragment)
                commit()
            }
        }

    }
}