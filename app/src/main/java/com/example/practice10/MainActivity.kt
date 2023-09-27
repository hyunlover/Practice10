package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ButtonClick(view: View) {
        val b1 : Button = findViewById(R.id.button1)
        val b2 : Button = findViewById(R.id.button2)
        if (b1.isClickable){
            b1.visibility = View.INVISIBLE
            b2.visibility = View.VISIBLE
        }
        else {
            b1.visibility = View.VISIBLE
            b2.visibility = View.INVISIBLE
        }
    }
}