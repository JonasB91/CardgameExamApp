package com.example.myexaminationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class Card( var value: Int,
             var image: Int,
             var suite: String){


}

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var imageView: ImageView
    var cardList = mutableListOf<Card>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.questionView)
        imageView = findViewById(R.id.mainImage)

        val buttonHigh = findViewById<Button>(R.id.buttonPressHigh)
        buttonHigh.setOnClickListener {
            buttonPressed()
        }
        val buttonLow = findViewById<Button>(R.id.buttonPressLow)
        buttonLow.setOnClickListener {
            buttonPressed()
        }

            cardsLibrary()

    }

    fun cardsLibrary(){
        val card1 = Card(2,R.drawable.clubsoftwo,"Clubs of two")
        val card2 = Card(3,R.drawable.heartofthree,"Hearts of three")
        val card3 = Card(5,R.drawable.diamondoffive,"Five of diamonds")
        val card4 = Card(7,R.drawable.spadeofseven,"Seven of spades")

        cardList.add(card1)
        cardList.add(card2)
        cardList.add(card3)
        cardList.add(card4)
    }

    fun getImageResource(number: String): Int {
        return when (number) {
            "1" -> R.drawable.clubsoface
            "2" -> R.drawable.clubsoftwo
            "3" -> R.drawable.clubsofthree
            "4" -> R.drawable.clubsoffour
            "5" -> R.drawable.clubsoffive
            "6" -> R.drawable.clubsofsix
            "7" -> R.drawable.clubsofseven
            "8" -> R.drawable.clubsofeight
            "9" -> R.drawable.clubsofnine
            "10" -> R.drawable.clubsoften
            "11" -> R.drawable.clubsofjack
            "12" -> R.drawable.clubsofqueen
            "13" -> R.drawable.clubsofking

            "14" -> R.drawable.diamondoface
            "15" -> R.drawable.diamondoftwo
            "16" -> R.drawable.diamondofthree
            "17" -> R.drawable.diamondoffour
            "18" -> R.drawable.diamondoffive
            "19" -> R.drawable.diamondofsix
            "20" -> R.drawable.diamondofseven
            "21" -> R.drawable.diamondofeight
            "22" -> R.drawable.diamondofnine
            "23" -> R.drawable.diamondoften
            "24" -> R.drawable.diamondofjack
            "25" -> R.drawable.diamondofqueen
            "26" -> R.drawable.diamondofking

            "27" -> R.drawable.heartoface
            "28" -> R.drawable.heartoftwo
            "29" -> R.drawable.heartofthree
            "30" -> R.drawable.heartoffour
            "31" -> R.drawable.heartoffive
            "32" -> R.drawable.heartofsix
            "33" -> R.drawable.heartofseven
            "34" -> R.drawable.heartofeight
            "35" -> R.drawable.heartofnine
            "36" -> R.drawable.heartoften
            "37" -> R.drawable.heartofjack
            "38" -> R.drawable.heartofqueen
            "39" -> R.drawable.heartofking

            "40" -> R.drawable.spadeoface
            "41" -> R.drawable.spadeoftwo
            "42" -> R.drawable.spadeofthree
            "43" -> R.drawable.spadeoffour
            "44" -> R.drawable.spadeoffive
            "45" -> R.drawable.spadeofsix
            "46" -> R.drawable.spadeofseven
            "47" -> R.drawable.spadeofeight
            "48" -> R.drawable.spadeofnine
            "49" -> R.drawable.spadeoften
            "50" -> R.drawable.spadeofjack
            "51" -> R.drawable.spadeofqueen
            "52" -> R.drawable.spadeofking
            else -> R.drawable.clubsoface
        }
    }



    fun buttonPressed() {


        val randomIndex = Random.nextInt(cardList.size);

        val randomElement = cardList[randomIndex]

        imageView.setImageResource(randomElement.image)
    }


}

// Hej oskar jag har skapat en ny gren