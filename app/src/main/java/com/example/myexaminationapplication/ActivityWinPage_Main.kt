package com.example.myexaminationapplication

import android.animation.Animator
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView

class ActivityWinPage : AppCompatActivity() {
    lateinit var fallingCard : ImageView
    lateinit var fallingCardTwo : ImageView
    lateinit var fallingCardThree : ImageView
    lateinit var fallingCardFour : ImageView
    lateinit var fallingCardFive : ImageView
    lateinit var fallingCardSix : ImageView
    lateinit var fallingCardSeven : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win_page)

        fallingCard = findViewById(R.id.fallingCardOne)
        fallingCardTwo = findViewById(R.id.fallingCardTwo)
        fallingCardThree = findViewById(R.id.fallingCardThree)
        fallingCardFour = findViewById(R.id.fallingCardFour)
        fallingCardFive = findViewById(R.id.fallingCardFive)
        fallingCardSix = findViewById(R.id.fallingCardSix)
        fallingCardSeven = findViewById(R.id.fallingCardSeven)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
        moveObjectDown()

        val scoreButton = findViewById<Button>(R.id.scoreButton)
        scoreButton.setOnClickListener {
            val intent = Intent(this, HighscoreActivity::class.java)
            startActivity(intent)
        }

    }

    fun moveObjectDownDirection() = (2500).toFloat()
    fun moveObjectDown() {

        fallingCard.animate()
        .translationY(moveObjectDownDirection()).duration = 3000
        fallingCardTwo.animate()
            .translationY(moveObjectDownDirection()).duration = 4000
        fallingCardThree.animate()
            .translationY(moveObjectDownDirection()).duration = 3200
        fallingCardFour.animate()
            .translationY(moveObjectDownDirection()).duration = 3400
        fallingCardFive.animate()
            .translationY(moveObjectDownDirection()).duration = 3600
        fallingCardSix.animate()
            .translationY(moveObjectDownDirection()).duration = 3800
        fallingCardSeven.animate()
            .translationY(moveObjectDownDirection()).duration = 4200



    }





}