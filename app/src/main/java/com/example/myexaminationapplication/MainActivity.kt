package com.example.myexaminationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var imageView: ImageView
    lateinit var scoreView: TextView

    val cardList =CardsList().cardList

    var score: Int = 0
    var firstCard: Card = Card(1,R.drawable.clubsoface,"Clubs")
    var secondCard: Card =Card(1,R.drawable.clubsoface,"Clubs")
    var scoreString: String =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scoreView =findViewById(R.id.textViewScore)
        textView = findViewById(R.id.questionView)
        imageView = findViewById(R.id.mainImage)

        val buttonHigh = findViewById<Button>(R.id.buttonPressHigh)
        buttonHigh.setOnClickListener {
            setNewrandomCard()
            checkAnswerHigh()

        }
        val buttonLow = findViewById<Button>(R.id.buttonPressLow)
        buttonLow.setOnClickListener {
            setNewrandomCard()
            checkAnswerLow()

        }


            //cardList.shuffle()
            setNewrandomCard()
            imageView.setImageResource(R.drawable.cardfrontside)

    }


    override fun onRestart() {
        super.onRestart()
        score = 0
        scoreString = score.toString()
        scoreView.text = scoreString
    }




    fun checkAnswerHigh() {

        if (firstCard.value > secondCard.value) {
            score++
        }
        else if (firstCard.value < secondCard.value){
            score = 0

        }
        else if (firstCard.value==secondCard.value){
            score+2
        }

        scoreString = score.toString()
        scoreView.text = scoreString

        if (score == 3) {
            val scoreResult = scoreString
            val intent = Intent(this, ActivityWinPage::class.java)
            intent.putExtra("scoreResult", scoreResult)
            startActivity(intent)

        }

    }

    fun checkAnswerLow()  {


        if (firstCard.value < secondCard.value) {
            score++
        }
        else if (firstCard.value >= secondCard.value){
            score = 0
        } else if (firstCard.value==secondCard.value){
            score+2
        }

        scoreString = score.toString()
        scoreView.text = scoreString

        if (score == 3) {
            val scoreResult = scoreString
            val intent = Intent(this, ActivityWinPage::class.java)
            intent.putExtra("scoreResult", scoreResult)
            startActivity(intent)

        }


    }

    fun setNewrandomCard() {
        secondCard = firstCard
        val randomIndex = Random.nextInt(cardList.size);

        firstCard = cardList[randomIndex]

        imageView.setImageResource(firstCard.image)

    }




}

