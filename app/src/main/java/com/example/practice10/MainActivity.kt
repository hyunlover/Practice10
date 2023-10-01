package com.example.practice10

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.linerlayout)
        setTitle("LinerLayout")
        setContentView(R.layout.tablelayout)
        setTitle("TableLayout")
       button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        button.setOnClickListener {
            button.visibility=View.INVISIBLE
            button2.visibility=View.VISIBLE
        }
        button2.setOnClickListener{
            button.visibility=View.INVISIBLE
            button2.visibility=View.VISIBLE
        }
    }


    fun ButtonClick(view: View) {




    }


}