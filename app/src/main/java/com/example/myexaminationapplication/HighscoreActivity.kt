package com.example.myexaminationapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class HighscoreActivity : AppCompatActivity() {
    lateinit var listTextView: TextView
    lateinit var editTextUsername : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_highscore)

        val buttonSaver = findViewById<Button>(R.id.saveButton)
        val loadButton = findViewById<Button>(R.id.loadBtn)
        editTextUsername = findViewById(R.id.editTextUsername)
        listTextView = findViewById(R.id.listTextView)


        buttonSaver.setOnClickListener {
            saveData() }

        loadButton.setOnClickListener {
            loadData()

        }
    }
    private fun saveData() {
        val insertedText = editTextUsername.text.toString()
        listTextView.text = insertedText

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.apply{
            putString("STRING_KEY", insertedText)
        }.apply()

        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show()
    }
    private fun loadData() {
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val savedString = sharedPref.getString("STRING_KEY",null)

        listTextView.text = savedString


    }
}
