package com.example.myexaminationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityLose : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)

        val backButton = findViewById<Button>(R.id.loseButton)
        backButton.setOnClickListener {
            finish()
        }





    }
}