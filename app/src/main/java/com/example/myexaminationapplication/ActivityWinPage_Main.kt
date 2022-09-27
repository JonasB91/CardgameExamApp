package com.example.myexaminationapplication

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

        val backButton = findViewById<Button>(R.id.buttonBack)
        backButton.setOnClickListener {
            finish()
        }
        moveObjectDown()


    }

    fun moveObjectDownDirection() = (2500).toFloat()
    fun moveObjectDown() {
        fallingCard.animate()
            .translationY(moveObjectDownDirection()).duration = 8500
        fallingCardTwo.animate()
            .translationY(moveObjectDownDirection()).duration = 10000
        fallingCardThree.animate()
            .translationY(moveObjectDownDirection()).duration = 9800
        fallingCardFour.animate()
            .translationY(moveObjectDownDirection()).duration = 9000
        fallingCardFive.animate()
            .translationY(moveObjectDownDirection()).duration = 9500
        fallingCardSix.animate()
            .translationY(moveObjectDownDirection()).duration = 11500
        fallingCardSeven.animate()
            .translationY(moveObjectDownDirection()).duration = 8000



    }





}